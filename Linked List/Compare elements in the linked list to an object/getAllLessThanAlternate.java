public LList<T> getAllLessThan(Comparable<T> anObject){
  LList<T> result = new LList<T>();
  Node scout = firstNode;
  
  for(int i=0; i<numberOfEntries; i++){
    T toCompare = scout.getData();
    if(anObject.compareTo(toCompare)>0)
      result.add(toCompare);
    scout = scout.getNextNode();
  }//end for loop 
  return result;
} //end method 
