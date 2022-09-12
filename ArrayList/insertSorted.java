package ArrayList;

import java.util.ArrayList;

/**Insert value sorted in increasing order **/
/* Precondition: ArrayList list contains integer values sorted in increasing order.
 * Postcondition: value inserted in its correct position in list 
 * if value is larger than all the element in list => 
 * throw IndexOutOfBoundsException if the first part of the test expression is omitted 
 * namely index < list(size()
 */

public class insertSorted {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(10);
		
		//before insertion 
		System.out.println(list);
		
		//after insertion 
		insert(list, 7);
		System.out.println(list);
		
		

	}
	public static <Integer extends Comparable >void insert(ArrayList<Integer> list, Integer value) {
		int index = 0;
		
		//find the insertion point 
		while( (index < list.size()) && (value.compareTo(list.get(index))> 0)) 
			index++;
		
			//insertion 
			list.add(index,value);
		
			
		
	}

}
