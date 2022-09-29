public class Link
{
     private  Link  next; //null if this is the last link
     private  int  value;
     public Link(Link  n,  int  v)
     {
           next  =  n;
           value  =  v;
      }
}

/*
 *Write a recursive instance method count that takes no parameters and returns an int. Return 
 * the number of links that hold the value zero, with the exception that the last link in the list is not 
 * included in the count. 
 * For example, for the linked list, {(first) 5→0→3→1→0→0 (last)} it would return the value 2.    
 */
  public int count(){
    int count = 0;
    
    //base case (if the node to the next valueis  null that's the last value=> just ignore)
    if(next == null)
       return 0;
    
    //otherwise if value !=0 => go to the next node and invoke count()
    //          if value ==0 => return 1 + (calling count for the next node)
    if (value == 0){
      return 1+ next.count();
    }
    return next.count(); 
  }
    
/*Write a recursive instance method isSorted that takes a Link parameter and determines 
 *whether a linked list is sorted in descending order or not (return a boolean value). 
 */
  public boolean isSort(Link n){
    //base case ( if the first value is null => nothing to compare to 
    // or if the last value is null => isSort() is true to the last node
    if (n == null || n.next==null) {
      return true;
    //base case 
    if (n.value < n.next.value){
      return false;
    }else{
      return isSort(n.next);
  }

    
/**Write a recursive instance method named findBad that takes no parameters and returns a 
 *reference to a Link.  The result of calling findBad is a reference to the first link that has a value 
 *greater than the next link's value. If no such link exists return null. For example, for 
 *{5→6→7→3→2} it would return a reference to the third link ("7").
 */
  public Link findBad(){
    
    //base case if the first node is null
    if (next ==null){
      return null;
    //base case if the curent value is less than the next value 
    if (value <= next.value){
      return next.findBad();
    }else{
      return next.value;
      
   
  }
    
