/**prints a linked list in a forward direction**/
public void printList(Node p){
  
  //base case
  if(p=null)
    return;
  
  else{
    System.out.println(p.value);
    printList(p.next()); //recursive call applied to a smaller LinkedListed 
                         //calling p.next() = 1 less node
  }
}
