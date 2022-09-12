package ArrayList;
import java.util.ArrayList;

public class removeDuplicate {

	public static void main(String[] args) {
		
		//any type of Object can be added to the ArrayList
		ArrayList<Object> al = new ArrayList<Object>();
		
		//add objects
		al.add("java");
		al.add('a');
		al.add('b');
		al.add("java");
		al.add("java");
		al.add('c');
		al.add(14);
		al.add("java");
		al.add("java");
		
		//before removing 
		System.out.println("Before removing Duplicate elements: " + al);
		
		//nested for loops for removing 
		for(int i=0; i<al.size(); i++) {
			for(int j=i+1; j<al.size(); j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j); 
					j--; //to avoid skipping elements 
					//i.e position at [4] is removed, decrement position to [3] 
					// => get out of the loop and increment position backa to[4]
				}
			}
		}
		
		//after removing 
		System.out.println("After removing duplicate element: " + al);
		
	}

}
