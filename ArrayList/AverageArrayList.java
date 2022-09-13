import java.util.ArrayList;

public class AverageArrayList {

	public static void main(String[] args) {
		//list hold 25 integers 
		int capacity = 25;
		ArrayList<Integer> list = new ArrayList<Integer>(capacity);
		
		for(int i=0; i< 25; i++ ) {
			list.add(10);
		}
		System.out.println(list);
		
		int av = computeAverage(list);
		System.out.println(av);
		
	}
	
	public static int computeAverage(ArrayList<Integer> list) {
		
		int total = 0;
		
		//Cycle throught all the element in the ArrayList
		for(Integer i: list) {
			total = total + i;
		}
		
		//size of the list 
		int numberOfElements = list.size();
		
		if(numberOfElements > 0) {
			
			return(total/numberOfElements);
		}
		else {
			System.out.println("ERROR: Cannot average 0 numbers");
			System.out.println("computeAverage returns 0");
			return 0;
		}
		
	}
	

}
