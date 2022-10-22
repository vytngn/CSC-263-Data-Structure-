//using while loop
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
    StackClass tempStack = new StackClass;
    double max = myStack.peek();
    
    //find largest value and place values on temp Stack 
    while(!myStack.isEmpty()){
      double temp = myStack.pop();
      if(temp>max) 
        max = temp;
        tempStack.push(temp);
    }//end while 
    
    //put all values except max back on original Stack 
    while(!tempStack.isEmpty()){
    double temp = tempStack.pop();
    
    if (temp!= max)
      myStack.push(temp);
    } //end while 
    return max;
    }//end else 
 //end method
   
     
     
   
    
   
     
