package app.domain;

public enum Resturant {
	
	MCDONALDS(1, "McDonalds"),
	BURGERKING(2, "BurgerKing"),
	SUBWAY(3, "Subway"),
	KFC(4,"KFC");
	
	private String name;
	private int id;
	
	private Resturant(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public static Resturant getById(int id) {
		for (Resturant r : values()) {
			if (r.getId() == id){
				return r;
			}
		}
	    return null;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
