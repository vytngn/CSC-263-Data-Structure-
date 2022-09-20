
public class List {
	protected Node head;
	protected int size;
  
	/**Method findThis**/
	public Node find(char findThis){
		Node current  = head; 
    
    /**Alternate method using for loop **/
    for(Node x = head; true; current=current.next){
      if(current.info ==findThis)
        return current;
    }//end for loop
	}	//end find()
}//end class


