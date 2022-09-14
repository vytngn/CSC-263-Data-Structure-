package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Remove all 2-character strings from list
 * Precondition: strList is initialized with String objects 
 */

public class iteratorEx2 {
	
	/**Main method 
	 * test removeTwos
	 */
	public static void main(String[] args) {
     List<String> list = new ArrayList<String>(); //superclass = subclass
		
		//initialize list with strings
		list.add("Jamie");
		list.add("Aaron");
		list.add("Cal");
		list.add("Hi");
		list.add("API");
		list.add("Cf");
		
		//print the original list 
		System.out.print("The original list: \n"); 
		printStr(list);
		
		//print the list after remove 
		System.out.print("\n\nThe list after removing string with 2 characters: \n");
		printStr(list);
		
	}
	
	/**Method removeTwos()
	 * remove 2-character string 
	 */
	
	public static void removeTwo(List<String> list){
		//assign iterator of list to itr
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			if(itr.next().length() ==2)
					itr.remove();
	
	}
	
	/**Method printStr()
	 * print each string in the list separated by white space
	 */
	public static void printStr(List<String> list) {
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + " ");
	}

}
