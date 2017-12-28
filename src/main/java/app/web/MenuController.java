package app.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.domain.Menu;
import app.domain.MenuItem;
import app.domain.Resturant;


@RestController
public class MenuController {

	@RequestMapping(value = "/getMenu/{id}", method = RequestMethod.GET)
	public Menu greeting(@PathVariable int id) {
		ArrayList<MenuItem> items = new ArrayList<>();
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Burger").withCalories(400).withFat(30).withCarbs(34).withProtein(50).build();
		MenuItem item2 = builder.withName("Chips").withCalories(500).withFat(40).withCarbs(84).withProtein(5).build();
		items.add(item1);
		items.add(item2);
		Menu menu = new Menu(Resturant.MCDONALDS.name(), items);
		return menu;
	}

}
