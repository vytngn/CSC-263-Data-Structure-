/**Question 1**/
//Write a generic static method that takes a Stack of any type element as a parameter, 
//pops each element from the stack, and prints it. 
// It should have a type parameter that represents the Stack’s element type.
public static <E> void popAndPrintStack(Stack<E> stack){
    while(!stack.isEmpty()){ 
    E item = stack.pop();
    System.out.println(item);
    }//end while loop
}

/**Question 2**/
//Given the Baby class below:
public Class Baby
{ 
     String  name;
     int  birthWeight;
}
//Write an equals method for the Baby class. 

public boolean equals(Object obj){
  
    if (object == null ) 
        return false;
  
    if(!(object instanceof(Baby))
       return false;
    if(this.name.equals(object.name) && this.birthWeigth == object.birthWeight)
        return true;
    else
        return false;
}





  
  
  






    

    
