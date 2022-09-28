//linear seach and return either null 
// or a reference to the node containing value 

public Node search(Node p, int value){
  //base case
  if(p ==null)
    return null;
  
  else if (p.value == value) 
    return p; //reference to the node containing value 
  else 
    return search(p.next, value); 
}
