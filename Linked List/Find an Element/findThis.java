public class List {
	protected Node head;
	protected int size;
  
	/**Method findThis**/
	public Node find(char findThis){
		Node current  = head; 
		
		//while the info of current node is not equal to findThis element
		while(current.info != findThis) {
			x=x.link; //advance the link list
			return x;
		} //end while loop
		return null;
	}	
}
