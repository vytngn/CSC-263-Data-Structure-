//Make findMax more general if the parameter is a List of ANY type that is Comparacble => use wildcard 


/**Method returns the largest value in the list**/
//Precondition: list is not an empty list 
public static Comparable findMax(List<? extends Comparable> list){
  
  //Create iterator of the list 
  Iterator<?extends Comparable> itr = list.iterator(); //points before the first element of the list
  
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
