/** Method addAll()
*/

public void addAll(T[] items){
  
  Node last = firstNode; //go to the end of the list 
  
  //counter control loop
  for(int i = 1; i< numOfEntries; i++){
    last=last.getNext();
    
    Node toAdd;
    
    //add new nodes at the end of the linked list 
    for(int j =0; j<items.length; j++){
      toAdd = new Node(item[j]);
      if (last ==null){
        firstNode = toAdd;
        lastNode = firstNode;
      }else{
        last.setNext(toAdd);// connects new node to LL
        last = toAdd;
        numberOfEntries++;
      }
    }
