public class LinkedStackClass<T> implements StackADT<T>{
  /* Define the node */
  private class StackNode<T>{
    public T info;
    public StackNode<T> link;
    
    /**Constructors**/
    /* default constructor */
    // Postcondition: info = null; link = null; */
    public StackNode(){
      info = null;
      link = null;
    }
    /* constructor with parameters */
    // set info point to the object elem points to 
    // link is set to point to the object ptr points to 
    // Post condition: info = elem; link = ptr
    public StackNode(T elem, StackNode<T> ptr){
      info = elem;
      link = ptr;
    }
    
    /**Methods**/
    //Method to return the info as a string 
    //Post condition: info as a String object is returned 
    public String toString(){
      return info.toString();
    }
  }//end of inner class 
    
    
    
    
