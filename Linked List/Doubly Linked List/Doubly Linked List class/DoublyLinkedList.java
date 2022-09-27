/Doubly linked list class with header and trailer
import  java.util.NoSuchElementException;
public class DoublyLinkedList
{
     private  DoublyListNode  headerNode;
     private  DoublyListNode  trailerNode;

     //construct an empty list
     public DoublyLinkedList( ){
  
            headerNode  =  new DoublyListNode(null, null, null);
            trailerNode  =  new  DoublyListNode(headerNode, null, null);
            headerNode.setNext(trailerNode);
     }
  
     //return true if list is empty, false otherwise
     public boolean isEmpty( ){
           return headerNode.getNext( )  ==  trailerNode; //or   return trailerNode.getPrev( )  == headerNode;
     }
  
     //return first node in a nonempty list
     public DoublyListNode  getFirstNode( ){  
       return  headerNode.getNext( );  
     }
  
    //return last node in a nonempty list
    public DoublyListNode  getLastNode( ){  
      return  trailerNode.getPrev( );  
    }
  
    //insert object o at the end of list
    public void addLast(Object o){
      DoublyListNode  p  =  new DoublyListNode(trailerNode.getPrev( ), o, trailerNode);
      trailerNode.getPrev( ).setNext(p);
      trailerNode.setPrev(p);
 }
       
    //insert object o at the front of list
    public void addFirst(Object o){  //implementation code is similar to addLast  }

    //remove and return the first element
    public Object  removeFirst(){
     if (isEmpty( ))
         throw  new  NoSuchElementException(“Can’t remove from empty list”);
     
      DoublyListNode  p  =  headerNode.getNext( );
      Object  item  =  p.getValue( );
      headerNode.setNext(p.getNext( ));
      p.getNext( ).setPrev(headerNode);
      return  item;
    }
      
    //remove and return the last element
    public Object  removeLast( ){  //implementation code is similar to removeFirst  
    }
      
      
  //add item to the left of node
  //Precondition: node refers to an element in a nonempty list
  void  addLeft(Object  item,  DoublyListNode  node){
     DoublyListNode  p  =  new  DoublyListNode(node.getPrev( ), item, node);
      node.setPrev(p); 
     p.getPrev( ).setNext(p);
  }
      
      
  //add item to the right of node
  //Precondition: node refers to an element in a nonempty list
  void  addRight(Object  item,  DoublyListNode  node){  
    //implementation code is similar to addLeft  
  }

  //remove the element referred to by node from the list 
  //Precondition: node points to element in the list
  public void remove(DoublyListNode  node){
     node.getPrev( ).setNext(node.getNext( ));
     node.getNext( ).setPrev(node.getPrev( ));
  }
      
  //return DoublyLinkedList as a String
  public String toString( )
  {
     if (isEmpty( ))
         return “empty. ”;
     else{
         String  s  =  “”;
         DoublyListNode  p  =  headerNode.getNext( );
         while (p  !=  trailerNode){
              s  =  s  +  p.getValue( )  +  “ ”;
              p  =  p.getNext( );
         } //end while 
         return  s;
     }//end else 
  }
}//end of class
