//Link list node 
public class ListNode{
  private Object value; //values in LinkedList are always Object
  private ListNode next; //self-referential object, next refer to itself
                         //pointer 
  //ListNode constructor, allows a single statement to assign the value and next fields to a ListNode 
  public ListNode(Object initValue, ListNode initNext){
     value = initValue;
     next = initNext;
  }
  
  //return value of the current ListNode 
  //type Object => a cast to integer, Double, or String will be needed 
  public Object getValue(){
    return value;
  }
  
  //accessor method returns next, the pointer value of the current ListNode 
  public ListNode getNext(){
    return next;
  }
  
  //mutator method allows the VALUE of the current ListNode to be updated. 
  public void setValue(Object theNewValue){
    value = theNewValue;
  }
  
  //mutator method allows the NEXT field of the current listnode to be updated to newNext 
  public void setNext(ListNode theNewNext){
    next = theNewNext;
  }
}
