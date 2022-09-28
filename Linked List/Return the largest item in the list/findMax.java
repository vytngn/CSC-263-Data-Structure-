/**Method returns the largest value in the list**/
//Precondition: list is not an empty list 
public static Comparable findMax(List<Integer> list){
  
  //Create iterator of the list 
  Iterator<Integer> itr = list.iterator(); //points before the first element of the list
  
  //Initialize first element is the max 
  Comparable max = itr.next();
  
  /** while(the list is not empty) { assign element to the first element to keep track of current element }
  * if max > element, keep advance 
  * if max < element, set current max = current element 
  * end loop, return max 
  */
  while(itr.hasNext()){
    Comparable current = itr.next();
    if(max.compareTo(current) < 0)
      max = current;
  } //end while loop
  return max;
}
