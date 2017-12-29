package app.service;

import java.util.ArrayList;

import app.domain.MenuItem;

public class MenuService {
	
	public static ArrayList<MenuItem> buildMenuItems () {
		ArrayList<MenuItem> items = new ArrayList<>();
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Filet-O-Fish").withCalories(400).withFat(67).withCarbs(88).withProtein(60).build();
		MenuItem item2 = builder.withName("Double Cheeseburger").withCalories(320).withFat(32).withCarbs(50).withProtein(80).build();
		MenuItem item3 = builder.withName("McDouble").withCalories(600).withFat(45).withCarbs(55).withProtein(55).build();
		MenuItem item4 = builder.withName("Big Mac").withCalories(245).withFat(40).withCarbs(33).withProtein(33).build();
		MenuItem item5 = builder.withName("Lobster Roll").withCalories(700).withFat(76).withCarbs(22).withProtein(55).build();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		return items;
	}

}
