/** Method add item to the left of node 
//Precondition: note refers to an element in a nonempty list
public void addLeft(Object item, DoublyListNode node){

  //create a new node p, point prev to node.getPrev, item = value, node = the next node
  DoublyList Node p = new DoublyListNode(node.getPrev(), item, node); 
  node.setPrev(p);
  p.getPrev().setNext(p); //point to the "next" field of (p.getPrev = previous of p )
}

