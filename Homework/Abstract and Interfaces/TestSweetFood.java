package SweetFood;


public class TestSweetFood {
	
	/**Main method **/
	public static void main(String[] args) {
	
	//Create objects 
	SweetFood candy = new Candy();
	SweetFood cake = new Cake();
	Bakable bakedCake = new Cake();
	Bakable potato = new Potato();
	
	//Output
	candy.raiseCalories();
	cake.sugarBoosts();
	bakedCake.bake();
	potato.bake();


	}

}
