package app.util;

import java.util.Comparator;

import app.domain.MenuItem;

public class MenuItemComparator implements Comparator<MenuItem> {
	
	private String by;
	private boolean sortAsc;	
	
	public MenuItemComparator(String by, boolean sortAsc) {
		this.by = by;
		this.sortAsc = sortAsc;
	}

    @Override
    public int compare(MenuItem o1, MenuItem o2) {
    	switch (this.by) {
    	case "name":
			return sortAsc ? o1.getName().compareTo(o2.getName())
					: o2.getName().compareTo(o1.getName());
		case "calories":
			return sortAsc ? Integer.valueOf(o2.getCalories()).compareTo(o1.getCalories())
					: Integer.valueOf(o1.getCalories()).compareTo(o2.getCalories());
		case "fat"	:
			return sortAsc ? Integer.valueOf(o2.getTotalFat()).compareTo(o1.getTotalFat())
					: Integer.valueOf(o1.getTotalFat()).compareTo(o2.getTotalFat());
		case "protein"	:
			return sortAsc ? Integer.valueOf(o2.getProtein()).compareTo(o1.getProtein())
					: Integer.valueOf(o1.getProtein()).compareTo(o2.getProtein());
		case "carbs":
			return sortAsc ? Integer.valueOf(o2.getCarbs()).compareTo(o1.getCarbs())
					: Integer.valueOf(o1.getCarbs()).compareTo(o2.getCarbs());					
			//TODO: the rest
		default:
			break;
		}
    	return 0;
    }

}
