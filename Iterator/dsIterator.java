/** Suppose 
* aList: 1 7 15 18 
* bList: 2 6 7 15 20 
**/

System.out.println("The following entries occur in both lists:");
boolean found;
Iterator<String> aIterator = aList.iterator();
while(aIterator.hasNext()){
  found = false; //reset found 
  while(bIterator.hasNext() && !found){
    String bObject = bIterator.next();
    if (aObject.equals(bObject)){
      //Found a common element
      System.out.print(aObject);
       found = true;
    } // end if 
  }//end while 
} //end while 

