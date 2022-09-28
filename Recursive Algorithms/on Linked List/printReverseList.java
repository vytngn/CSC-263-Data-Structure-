
// print in reverse => get to the end of the list 
//print from right to left 

public void printReverseList(Node p){
  
  //base case 
  if(p == null)
    return; 
  else{
    printReverseList(p.next()); //get to the end of the list
    System.out.println(p.value);
  }
  
}
