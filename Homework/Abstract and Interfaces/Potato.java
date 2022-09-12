package SweetFood;

/**class Potato **/
class Potato implements Bakable {
	@Override 
	public void bake() {
		System.out.println("The " + getClass().getName() + " browns and gets crispy!");
	}
	
}
