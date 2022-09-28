/** Methods take no argument and returns an integer 
* double each link's value until a link value of zero is reach,
* or there is no more links. 
* Return the number of non-zero links modified 
*/

public int lookOut(){ 
  
  //base case 
  if ( value ==0 ) 
    return 0; //0 value in Linked list 
  
  value*=2; //otherwise double the first value 
  
  if (next == null)
    return 1; //if the there is no pointer to next value, then return 1 
  
  else return 1 + next.lookOut(); //have more than 1 value that can get double 
}
