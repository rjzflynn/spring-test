package app.service;

import java.util.ArrayList;

import app.domain.MenuItem;
import app.domain.Resturant;

public class MenuService {

	public static ArrayList<MenuItem> buildMenuItems(int id) {
		ArrayList<MenuItem> items = new ArrayList<>();
		Resturant resturant = Resturant.getById(id);
		switch (resturant) {
		case MCDONALDS:
			items = addMcDonaldsItems(items);
			break;
		case BURGERKING:
			items = addBurgerKingItems(items);
			break;
		case SUBWAY:
			items = addSubwayItems(items);
			break;
		case KFC:
			items = addKFCItems(items);
			break;
		default:
			break;
		}
		return items;
	}

	private static ArrayList<MenuItem> addMcDonaldsItems(
			ArrayList<MenuItem> items) {
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Filet-O-Fish").withCalories(400)
				.withFat(67).withCarbs(88).withProtein(60).build();
		MenuItem item2 = builder.withName("Double Cheeseburger")
				.withCalories(320).withFat(32).withCarbs(50).withProtein(80)
				.build();
		MenuItem item3 = builder.withName("McDouble").withCalories(600)
				.withFat(45).withCarbs(55).withProtein(55).build();
		MenuItem item4 = builder.withName("Big Mac").withCalories(245)
				.withFat(40).withCarbs(33).withProtein(33).build();
		MenuItem item5 = builder.withName("Lobster Roll").withCalories(700)
				.withFat(76).withCarbs(22).withProtein(55).build();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		return items;
	}

	private static ArrayList<MenuItem> addBurgerKingItems(
			ArrayList<MenuItem> items) {
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Farmshose King").withCalories(400)
				.withFat(67).withCarbs(88).withProtein(60).build();
		MenuItem item2 = builder.withName("Rodeo King").withCalories(320)
				.withFat(32).withCarbs(50).withProtein(80).build();
		MenuItem item3 = builder.withName("BBQ Bacon Whopper")
				.withCalories(600).withFat(45).withCarbs(55).withProtein(55)
				.build();
		MenuItem item4 = builder.withName("Double Whopper").withCalories(245)
				.withFat(40).withCarbs(33).withProtein(33).build();
		MenuItem item5 = builder.withName("Bacon King").withCalories(700)
				.withFat(76).withCarbs(22).withProtein(55).build();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		return items;
	}

	private static ArrayList<MenuItem> addSubwayItems(ArrayList<MenuItem> items) {
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Italian BMT").withCalories(400)
				.withFat(67).withCarbs(88).withProtein(60).build();
		MenuItem item2 = builder.withName("Steak and Cheese").withCalories(320)
				.withFat(32).withCarbs(50).withProtein(80).build();
		MenuItem item3 = builder.withName("Ham").withCalories(600).withFat(45)
				.withCarbs(55).withProtein(55).build();
		MenuItem item4 = builder.withName("Meatball").withCalories(245)
				.withFat(40).withCarbs(33).withProtein(33).build();
		MenuItem item5 = builder.withName("Marinara").withCalories(700)
				.withFat(76).withCarbs(22).withProtein(55).build();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		return items;
	}

	private static ArrayList<MenuItem> addKFCItems(ArrayList<MenuItem> items) {
		MenuItem.Builder builder = new MenuItem.Builder();
		MenuItem item1 = builder.withName("Mighty Bucket for one")
				.withCalories(400).withFat(67).withCarbs(88).withProtein(60)
				.build();
		MenuItem item2 = builder.withName("4 Piece Boneless dips")
				.withCalories(320).withFat(32).withCarbs(50).withProtein(80)
				.build();
		MenuItem item3 = builder.withName("6 Piece Boneless dips")
				.withCalories(600).withFat(45).withCarbs(55).withProtein(55)
				.build();
		MenuItem item4 = builder.withName("Large Popcorn Chicken Meal")
				.withCalories(245).withFat(40).withCarbs(33).withProtein(33)
				.build();
		MenuItem item5 = builder.withName("2 Piece Orginal Recipe Meal")
				.withCalories(700).withFat(76).withCarbs(22).withProtein(55)
				.build();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		return items;
	}

}
