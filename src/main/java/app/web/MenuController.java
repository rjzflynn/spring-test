package app.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.domain.MenuItem;
import app.domain.Resturant;
import app.service.MenuService;


@RestController
public class MenuController {

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
	public ArrayList<MenuItem> getMenu(@PathVariable int id) {
		System.out.println("called " + id);
		return MenuService.buildMenuItems(id);
	}

}
