/**Question 1**/
//Write a generic static method that takes a Stack of any type element as a parameter, 
//pops each element from the stack, and prints it. 
// It should have a type parameter that represents the Stack’s element type.
public static <E> void popAndPrintStack(Stack<E> stack){
    while(!(stackTop == null)){ 
    //store reference data of the top element to a string and print it 
    String s = stackTop.info;
    System.out.print(s + " ");
    //pop operation
    stackTop = stackTop.link; //point stackTop the next link 
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
  
//return true if point to the same object 
if(this == obj)
  return true;
  
// if object is pointing to null, or if object not belongs  to the same class return false 
if ((obj == null)  || this.getClass() != obj.getClass()) 
  return false;

//type casting object 
Baby baby1 = (Baby)obj;

//compare value of objects 
return this.name.equals(baby1.name) && this.birthWeight.equals(baby1.birthWeight);
} // end method 

// Another way of equals method 
public boolean equals(Object obj){
  if (obj instanceof Baby){
  //type casting 
  Baby baby1 = (Baby)obj;
  return name.equals(baby1.name) && birthWright.equals(baby1.birthWright);
  } //end if
  return false; //return false if obj is not an instance of Baby class
} // end method 



  
  
  






    

    
