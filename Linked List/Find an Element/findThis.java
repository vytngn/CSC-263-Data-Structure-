public class List {
	protected Node head;
	protected int size;
  
	/**Method findThis**/
	public Node find(char findThis){
		Node current = head; 
		
		while(current !=null) {
			if(current.info == findThis) {
				return current;
			}
			current=current.link;
		} //end while loop
		return null;
	}
}
