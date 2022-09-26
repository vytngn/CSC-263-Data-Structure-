//Insert object o at the end of the list 
public void addLast(Object o){
  if (isEmpty()){ //if the list if empty 
    
    lastNode = new ListNode(o,null); //create new node & initialize with o and null and assigned to lastNode 
    lastNode.setNext(lastNode); //the "next" field of last Node points to lastNode => make a circular list 
    
  } else // if list is NOT empty 
    
    headNode = lastNode; // point headNode to lastNode  
    ListNode p = newListNode(o, lastNode.getNext()); // create a new node and point the "next" field of p to lastNode.next
    lastNode.setNext(p); // assign the lastNode.next from null to p 
    lastNode = p; // assign lastNode to p 
    lastNode.setNext(headNode); // make the list circular 
                                // the next field of lastNode is now point to headNode 
  } //end if-else 
} // end method 
