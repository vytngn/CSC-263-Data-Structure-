//return the contents of a circular linked list as a String 
public String toString(){
  if(isEmpty())
    
    return "empty."; //if empty return empty string
  
  else{
    
    String s = ""; 
    ListNode current = lastNode.getNext(); // create a node name current and point to lastNode.next()
    
    while ( current != lastNode){
      s  = s + current.getValue() + " "; //concat 
      current = current.getNext(); advanced current 
     } //end while 
    
      s = s + current.getValue(); // capture the value of the last node if omitted => string s will not have the data of the last node 
      return s;
  } //end else 
}//end method 
     
