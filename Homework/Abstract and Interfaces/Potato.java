package SweetFood;

public class Potato extends Bakable {
	@Override 
	public String bake() {
		return "The " + getClass()+ " and " + getClass().getName() + " browns and gets crispy!";
	}
	
}
