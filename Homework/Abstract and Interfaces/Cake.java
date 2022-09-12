package SweetFood;

/** subclass Cake **/
class Cake extends SweetFood implements Bakable{
	//subclass constructor 
	public Cake() {
		super("Cake");
	}
	
	//define abstract method bake()
	public void bake() {
		System.out.println("This " + getClass().getName() + " raises and get fluffy!");
	}
	
	
}
