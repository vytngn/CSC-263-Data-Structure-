//Write a non-generic method findAndRemoveLargest (StackClass myStack) that finds and removes the largest value in myStack. 
//The method returns the largest value, otherwise leaves myStack in the original order. 
//Return -373 if myStack is empty.

 
 public static double findAndRemoveLargest (StackClass myStack){
   //if stack is empty return -373
   if (myStack==0)
     return -373;
   else{
    //Create a temporary stack 
    //set topelement of myStack to max value for comparing 
   StackClass temp = new StackClass(size);
   
   
   double max = myStack.peek()
     
   for( int i = 0; i<myStack.size(); i++){
     double currentE = myStack.pop();
    //compare with max, if currentE is larger than set max= currentE 
    if(max<currentE)
      max = currentE;
    
   //push all elements in myStack to temp
   temp.push(currentE);
   }
   
   //compare all elements in temp stack with the max value
   //pushing all the value different than max back to myStack
   //largest value will not be in the original stack but the temp stack 
   for(int i=0; i< myStack.size(); i++){
     double currentE = temp.pop()
       if(max !=currentE)
       myStack.push(currentE);
   }
   return max;
    
   
     
     
     
