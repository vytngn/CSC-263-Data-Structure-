/** NAME: VY NGUYEN 
 * CSC-236-IN 
 * LINKED LIST HOMEWORK 3
 * Suppose that a list contains Comparable objects. 
 * Implement a method that returns a new list of items that are less than some given item.  
 * The header of the method could be as follows:
 * 			public  LList<T>  getAllLessThan( Comparable<T>  anObject)
 * Write an implementation of this method for the class LList. 
 * Make sure that your method does not affect the state of the original list.
 */

// Method returns elements in a Linked List that are less than the Comprable object 
//Precondition: list is a non empty list 

public  LList<T>  getAllLessThan( Comparable<T>  anObject){
	
	//create a new list that stores the element less than Comparable object 
	LList<T> list = new LList();
	
	//create a node name current points to the first node 
	Node current = firstNode;
  
	while (current !=null) {
		if(current.getValue().compareTo(anObject < 0)) // value of current node  < anObject 
			list.add(current.getValue);
		current  = current.getNext(); //advance the currentNode to the next Node
	}//end while 
	return list;
}
