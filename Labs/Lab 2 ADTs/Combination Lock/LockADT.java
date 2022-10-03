/**Lock Data Structure class**/
public class Lock {
private int x,y,z;
private boolean isLock;

/**Constructors**/
//default constructor
public Lock(){
  int x = 0;
  int y = 0;
  int z = 0;
  isLock = true;
}
//overloaded constructor 
public Lock(int x, int y, int z){
  if (x >39 || y > 39 || z > 39) throw new IllegalArgumentException("Number should be from 0 to 39.");
        else
        this.x = x;
        this.y = y;
        this.z = z;
}

//copy constructor 
public Lock(Lock lock){
  x = lock.x;
  y = lock.y;
  z = lock.z;
}

/**Mutator methods**/

//set X
public void setX(int x){
  this.x = x;
}

//set Y
public void setY(int y){
  this.y = y;
}

//set Z
public void setZ(int z){
  this.z = z;
}

//set new combination 
public void setNewLock(int newX, int newY, int newZ){
  x = newX;
  y= newY;
  z= newZ;
}

//close the lock
public void close(){
  isLock = true;
}
//open the lock
public void open(){
  isLock = false;
}

/**Accessor method**/

//return true if the lock is locked 
public boolean isLock(){
  return isLock;
}

/**Mutator method**/ 

//get current number the dial pointing at 

// to String method 
public String toString(){
  if (isLocked = false)
    return "Lock is open.";
  else 
    return "Lock is closed.";
}



