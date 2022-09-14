package Iterator;

/**Print strings in the list, one perline **/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorEx1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); //superclass = subclass
		
		//initialize class with strings
		list.add("Jamie");
		list.add("Aaron");
		list.add("Cal");
		
		//Print strings in list, one per line using Iterator in 
		for(Iterator<String> itr =  list.iterator(); itr.hasNext();)
			System.out.println(itr.next());
		
		
		//equivalent for each loop 
		for(String str: list) //No iterator in sight 
			System.out.println(str);
		

	}

}
