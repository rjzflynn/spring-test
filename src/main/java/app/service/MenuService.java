package app.service;

import java.util.ArrayList;

import app.domain.MenuItem;
import app.domain.Resturant;

public class MenuService {

	public static ArrayList<MenuItem> buildMenuItems(int id, String catagory) {
		ArrayList<MenuItem> items = new ArrayList<>();
		Resturant resturant = Resturant.getById(id);
		switch (resturant) {
		case MCDONALDS:
			items = addMcDonaldsItems(items, catagory);
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
			ArrayList<MenuItem> items, String catagory) {
		
		switch (catagory) {
		case "Beef":
			items = buildMcDonaldsMenuItems(items, new String[] { "Hamburger",
					"Cheeseburger", "BigMac", "Double Cheeseburger",
					"Big Tasty" });
			break;
		case "Chicken":
			items = buildMcDonaldsMenuItems(items, new String[] {
					"Chicken Bacon Burger", "Crispy Chicken Wrap",
					"McChicken Sandwich", "Chicken Mcggets (6 piece)",
					"Chicken Mcggets (8 piece)" });
			break;
		case "Fish":
			items = buildMcDonaldsMenuItems(items, new String[] {
					"Filet O Fish", "Fish Fingers", "Fish Salad", "Fish",
					"More Fish" });
			break;
		case "Salads":
			items = buildMcDonaldsMenuItems(items, new String[] {
					"Grilled Chicken & Bacon Salad", "Grilled Chicken Salad",
					"Crispy Chicken & Bacon Salad", "Side Salad", "Salad" });
			break;
		case "Sides":
			items = buildMcDonaldsMenuItems(items, new String[] {
					"Carrot Sticks", "Side Salad", "French Fries (Small)",
					"French Fries (Medium)", "French Fries (Large)" });
			break;
		default:
			break;
		}
		
		return items;
	}
	
	private static ArrayList<MenuItem> buildMcDonaldsMenuItems(ArrayList<MenuItem> items, String[] names) {
		
		MenuItem.Builder builder = new MenuItem.Builder();
					
			MenuItem item1 = builder.withName(names[0]).withCalories(400)
					.withFat(67).withCarbs(88).withProtein(60).withCalsFromFat(20)
					.withTransFat(32).withSaturatedFat(13).build();
			MenuItem item2 = builder.withName(names[1])
					.withCalories(320).withFat(32).withCarbs(50).withProtein(80)
					.withCalsFromFat(20).withTransFat(32).withSaturatedFat(13)
					.build();
			MenuItem item3 = builder.withName(names[2]).withCalories(600)
					.withFat(45).withCarbs(55).withProtein(55).withCalsFromFat(20)
					.withTransFat(32).withSaturatedFat(13).build();
			MenuItem item4 = builder.withName(names[3]).withCalories(245)
					.withFat(40).withCarbs(33).withProtein(33).withCalsFromFat(20)
					.withTransFat(32).withSaturatedFat(13).build();
			MenuItem item5 = builder.withName(names[4]).withCalories(700)
					.withFat(76).withCarbs(22).withProtein(55).withCalsFromFat(20)
					.withTransFat(32).withSaturatedFat(13).build();					
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
	
	
	public static ArrayList<String> buildMenuCatagories(int id) {
		//TODO:
		ArrayList<String> catagories = new ArrayList<String>();
		catagories.add("Beef");
		catagories.add("Chicken");
		catagories.add("Fish");
		catagories.add("Salads");
		catagories.add("Sides");
		return catagories;
	}

}
