package SweetFood;

public class TestSweetFood {

	public static void main(String[] args) {
		
	SweetFood candy = new Candy();
	SweetFood cake = new Cake();
	Bakable bakedCake = new Cake();
	Bakable potato = new Potato();
	
	
	System.out.println(candy.raiseCalories());
	System.out.println(cake.sugarBoosts());
	System.out.println(bakedCake.bake());
	System.out.println(potato.bake());
	


	}

}
