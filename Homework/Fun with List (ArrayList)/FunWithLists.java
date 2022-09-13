package ArrayListHW;

import java.util.ArrayList;
import java.util.Scanner;

public class FunWithLists {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option to create a list of the following data type: ");
		System.out.println("1. Integer, 2.Double, 3. String");
		
		int option = sc.nextInt();
		switch (option) {
		case 1:
			ArrayList<Integer> intList = new ArrayList<>(100);
			System.out.println("A list of interger type is created.");break;
		case 2:
			ArrayList<Double> doubleList = new ArrayList<>(100);
			System.out.println("A list of double type is created.");break;
		case 3:
			ArrayList<String> strList = new ArrayList<>(100);
			System.out.println("A list of string type is created.");break;
		default:
			System.out.println("Invalid option.");
			
		}
		
		
	}

}
