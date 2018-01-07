package app.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.domain.MenuItem;
import app.service.MenuService;
import app.util.MenuItemComparator;

@RestController
public class MenuController {
	
	@CrossOrigin()
	@RequestMapping(value = "/getMenuCatagories/{id}", method = RequestMethod.GET)
	public ArrayList<String> getMenuCatagories(@PathVariable int id) {
		ArrayList<String> catagories = new ArrayList<String>();
		catagories.add("Beef");
		catagories.add("Chicken");
		catagories.add("Fish");
		catagories.add("Salads");
		catagories.add("Sides");
		return catagories;
	}

	@CrossOrigin()
	@RequestMapping(value = "/getMenu/{id}/{catagory}", method = RequestMethod.GET)
	public ArrayList<MenuItem> getMenu(@PathVariable int id, @PathVariable String catagory,
			@RequestParam(value = "sort", required = false) String sort,
			@RequestParam(value = "by", required = false) String by) {
		
		List<MenuItem> menuItems = MenuService.buildMenuItems(id, catagory);

		if (sort != null) {
			boolean sortAsc = sort.equalsIgnoreCase("asc");
			Collections.sort(menuItems, new MenuItemComparator(by, sortAsc));
			return (ArrayList<MenuItem>) menuItems;
		}
		return (ArrayList<MenuItem>) menuItems;
	}

}
