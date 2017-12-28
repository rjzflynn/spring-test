package app.domain;

public enum Resturant {
	
	MCDONALDS(1, "McDonalds"),
	BURGERKING(2, "BurgerKing");
	
	private String name;
	private int id;
	
	private Resturant(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	

}
