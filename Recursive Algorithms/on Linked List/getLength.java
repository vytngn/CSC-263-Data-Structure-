public int length(Node p){
  //base case 
  if(p == null)
    return 0;
  
  else 
    return 1+length(p.next); //if the p is not null then current count of length = 1
}
