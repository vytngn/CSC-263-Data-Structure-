package ArrayList;

import java.util.ArrayList;

public class AutoBoxingvsAutoUnboxing {
	

	public static void main(String[] args) {
		
		//create an ArrayList 
		//default capacity of 10
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// add to list 0 1 4 9 
		for(int i = 0; i < 4; i++)
			list.add(i*i); // auto boxing => i*i wrapped in an Integer before insertion 
		
		Integer intObj = list.get(2); //assign Integer with value 4 to int 
									// leaves list unchanged. 
		int n = list.get(3); //auto-unboxing => integer is retrieved and converted to int 
							// n = 9
		
		Integer x = list.set(3, 5); // set 5 to index 3 => list is 0 1 4 5 
									// x containing Integer with value 9
		
		x= list.remove(2); // list is 0 1 5
							// x containing Integer with value of 4
		
		//add(index,element)
		list.add(1,7); // list is 0 7 1 5 
		list.add(2,8); // list is 0 7 8  1 5 
		
		System.out.println(list);
		
	}

}
