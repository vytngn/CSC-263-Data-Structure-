public int sum(Node p){
  //base case 
  if (p==null)
    return 0;
  
  else 
    return p.value +sum(p.next()); //sum all value and then add the first value 
}
