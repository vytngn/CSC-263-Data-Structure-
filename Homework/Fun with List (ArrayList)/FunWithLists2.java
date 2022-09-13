package ArrayListHW;

import java.util.*;
import java.util.ArrayList;

public class FunWithLists2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		//declare list
		ArrayList<?> list;
		String listElement;
		
		//Prompt options 
		System.out.println("Select option to create a list of the following data type: ");
		System.out.println("1. Integer, 2.Double, 3. String");
		
		option = sc.nextInt();
		switch (option) {
		case 1:
			list = new ArrayList<Integer>(100);
			System.out.println("A list of interger type is created.");break;
		case 2:
			list = new ArrayList<Double>(100);
			System.out.println("A list of double type is created.");break;
		case 3:
			list = new ArrayList<String>(100);
			System.out.println("A list of string type is created.");break;
		default:
			System.out.println("Invalid option.");	
		}
		

	}

}
