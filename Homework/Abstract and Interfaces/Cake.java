package SweetFood;

class Cake extends Bakable implements SweetFood {
	@Override 
	public String sugarBoosts() {
		return "This Cake sugarBoosts.";
	}
	
	public String raiseCalories() {
		return "This Cake raiseCalories.";
	}
	
	@Override 
	
	public String bake() {
		return "The " + getClass() + " and " + getClass().getName() + " rises and gets fluffy!";
	}
	
}

