/**Remove the eelment referred to by node from the list **/
//Precondition: node points to element in the list 
public void remove(DoublyListNode node){
  node.getPre().setNext(node.getNext());
  node.getNext().setPrev(node.getPrev());
}
