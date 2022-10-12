/**VY NGUYEN 
 * CSC263-IN
 * LAB2 ADT - MUSICAL NOTE
 */
public class NoteClientDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiate two note objects using the overloaded constructor 
		NoteDataStructureClass note1 = new NoteDataStructureClass("Whole",-6 );
		NoteDataStructureClass note2 = new NoteDataStructureClass("Sixteenth",2);
		
		
		//two note object using default constructor 
		NoteDataStructureClass note3 = new NoteDataStructureClass();
		NoteDataStructureClass note4 = new NoteDataStructureClass();
		
		//copy object 
		NoteDataStructureClass note5 = new NoteDataStructureClass(note1);
		
		
		System.out.println(note1);
		System.out.println("-----------------------------------------");
		System.out.println(note2);
		System.out.println("-----------------------------------------");
		System.out.println(note3);
		System.out.println("-----------------------------------------");
		System.out.println(note4);
		System.out.println("-----------------------------------------");
		System.out.println(note5);
	}

}
