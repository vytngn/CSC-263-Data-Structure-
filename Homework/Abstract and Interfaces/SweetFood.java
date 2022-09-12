package SweetFood;

// SweetFood cannot be instantiated 
/**Abstract class SweetFood **/
public abstract class SweetFood {
	//constant field 
	private final String name;
	
	//overloaded constructor 
	public SweetFood(String name) {
		this.name = name;
	}
	
	//default constructor 
	public 	SweetFood() {
		this("SweetFood"); //call the overloaded constructor accept a string in this class  
	}
	
	
	/*sugarBoosts method print a string */
	public void sugarBoosts() {
		System.out.println("This " + name + "sugarBoosts");
	}
	/*raiseCalories method print a string*/
	public void raiseCalories() {
		System.out.println("This " + name + " raiseCalories");
		
		
	}
}
