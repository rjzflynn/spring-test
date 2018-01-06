package app.domain;


public class MenuItem {

	private String name;
	private int calories;
	private int caloriesFromFat;
	private int totalFat;
	private double saturatedFat;
	private double transFat;
	private int cholesterol;
	private int sodium;
	private int carbs;
	private int fibre;
	private int sugar;
	private int protein;
	private int vitA;
	private int vitC;
	private int calcuim;
	private int iron;

	private MenuItem(String name, int calories, int caloriesFromFat, int totalFat, double saturatedFat, double transFat,
			int cholesterol, int sodium, int carbs, int fibre, int sugar, int protein, int vitA, int vitC, int calcuim,
			int iron) {
		super();
		this.name = name;
		this.calories = calories;
		this.caloriesFromFat = caloriesFromFat;
		this.totalFat = totalFat;
		this.saturatedFat = saturatedFat;
		this.transFat = transFat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carbs = carbs;
		this.fibre = fibre;
		this.sugar = sugar;
		this.protein = protein;
		this.vitA = vitA;
		this.vitC = vitC;
		this.calcuim = calcuim;
		this.iron = iron;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getCaloriesFromFat() {
		return caloriesFromFat;
	}

	public void setCaloriesFromFat(int caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public int getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(int totalFat) {
		this.totalFat = totalFat;
	}

	public double getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(double saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public double getTransFat() {
		return transFat;
	}

	public void setTransFat(double transFat) {
		this.transFat = transFat;
	}

	public int getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(int cholesterol) {
		this.cholesterol = cholesterol;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getFibre() {
		return fibre;
	}

	public void setFibre(int fibre) {
		this.fibre = fibre;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getVitA() {
		return vitA;
	}

	public void setVitA(int vitA) {
		this.vitA = vitA;
	}

	public int getVitC() {
		return vitC;
	}

	public void setVitC(int vitC) {
		this.vitC = vitC;
	}

	public int getCalcuim() {
		return calcuim;
	}

	public void setCalcuim(int calcuim) {
		this.calcuim = calcuim;
	}

	public int getIron() {
		return iron;
	}

	public void setIron(int iron) {
		this.iron = iron;
	}

	public String toString() {
		return "MenuItem [name=" + name + ", calories=" + calories + ", caloriesFromFat=" + caloriesFromFat
				+ ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat + ", transFat=" + transFat
				+ ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", carbs=" + carbs + ", fibre=" + fibre
				+ ", sugar=" + sugar + ", protein=" + protein + ", vitA=" + vitA + ", vitC=" + vitC + ", calcuim="
				+ calcuim + ", iron=" + iron + "]";
	}
	


	public static class Builder {

		private String name;
		private int calories;
		private int caloriesFromFat;
		private int totalFat;
		private double saturatedFat;
		private double transFat;
		private int cholesterol;
		private int sodium;
		private int carbs;
		private int fibre;
		private int sugar;
		private int protein;
		private int vitA;
		private int vitC;
		private int calcuim;
		private int iron;

		public Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withCalories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder withCarbs(int carbs) {
			this.carbs = carbs;
			return this;
		}

		public Builder withProtein(int protein) {
			this.protein = protein;
			return this;
		}

		public Builder withFat(int totalFat) {
			this.totalFat = totalFat;
			return this;
		}
		
		public Builder withCalsFromFat(int calsFromFat) {
			this.caloriesFromFat = calsFromFat;
			return this;
		}
		
		public Builder withSaturatedFat(int saturatedFat) {
			this.saturatedFat = saturatedFat;
			return this;
		}
		
		public Builder withTransFat(int transFat) {
			this.transFat = transFat;
			return this;
		}

		public MenuItem build() {
			return new MenuItem(name, calories, caloriesFromFat, totalFat, saturatedFat, transFat, cholesterol, sodium,
					carbs, fibre, sugar, protein, vitA, vitC, calcuim, iron);
		}

	}


}
