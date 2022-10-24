
/**Patient class **/
// create a queue for patient with specified priority 
public class Patient implements Comprable{
  //define variable 
  private String myName;
  private int myPriority;
  
  //constructor 
  public Patitent(String name, int priority){
    myName = name;
    myPriority = priority;
  }
  
  //compare to method 
  public int compareTo(Object o){
    Patient rhs = (Patient) o ; //cast object o to Patient type 
    
    //compare object with this 
    if (myPriority < rhs.myPriority) 
      return -1;
    else if (myPriority > rhs.myPriority)
      return 1;
    else 
      return 0;
  }
  // to String method 
  public String toString(){
  S tring s = myName + "with prioroty" + myPriority'
    return s;
  }
}//end Patient class 

/**Main class **/
//PriQueueTest.java
//illustrates priority queue
import java.util.*;
public class PriQueueTest{
  public static void main(String[] args){
    PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
    Patient p1 = new Patient("John Smith",3);
    Patient p2 = new Patient("Mary Johns", 1);
    Patient p3 = new Patient("Shiba", 2);
    
    pq.add(p1);
    pq.add(p2);
    pq.add(p3);
    
    while(!pq.isEmpty()){
      System.out.println("The next patient for liver transplant is: ");
      System.out.println(pq.remove());
    }
  }
} //end main class 
           
    

    
