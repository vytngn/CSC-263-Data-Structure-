/**Main method**/
public class Main{
	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		list.firstNode = new Node(2);
		list.firstNode.next = new Node(3);
		int[] items = {4,5,6,7};
		list.addAll(items);
		list.display();
	}
}

class Node{
	int value;
	Node next;
	
	/**constructor**/
	Node(int value){
		this.value = value;
		next = null;
	}
}

// LinkedList Class
class LinkedList{
	Node firstNode;
	LinkedList(int value){
	firstNode = new Node(value);
}
	

/**Method addAll**/
public void addAll(int[] items){
	
	Node current = firstNode;
	
	// reaching the last node if current.next == null 
	while(current.next!=null) { 
		current=current.next;
	}//end while loop when reaching last node
	
	//adding element of array to the last node 
	for(int e:items){
		current.next = new Node(e);
		current = current.next;
	}
}

public void display(){
	Node current = firstNode;
	while(current!=null){
		System.out.print(current.value+ " ");
		current = current.next;
	}
	System.out.println();
	}
}
