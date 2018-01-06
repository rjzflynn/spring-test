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
	@RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
	public ArrayList<MenuItem> getMenu(@PathVariable int id,
			@RequestParam(value = "sort", required = false) String sort,
			@RequestParam(value = "by", required = false) String by) {

		List<MenuItem> menuItems = MenuService.buildMenuItems(id);

		if (sort != null) {
			boolean sortAsc = sort.equalsIgnoreCase("asc");
			Collections.sort(menuItems, new MenuItemComparator(by, sortAsc));
			return (ArrayList<MenuItem>) menuItems;
		}
		return (ArrayList<MenuItem>) menuItems;
	}

}
