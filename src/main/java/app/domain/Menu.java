package app.domain;

import java.util.ArrayList;


public class Menu {
		
	String resturant; 
	ArrayList<MenuItem> menuItems;
	
	public Menu(String resturant, ArrayList<MenuItem> menuItems) {
		super();
		this.resturant = resturant;
		this.menuItems = menuItems;
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public String getResturant() {
		return resturant;
	}
}
