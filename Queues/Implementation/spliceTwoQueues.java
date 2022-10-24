/* An add method to a class of queues that will splice two queues together. 
* This method adds to the end of the queue all items that are in a second queue. 
* this method will work in any class that implementing QueueInterface<T>
*/

/**Algorithm
* remove item from another Queue until and add them to this queue
* until the second queue becomes empty
**/


public void splice(QueueInterface<T> anotherQueue){
  while(!anotherQueue.isEmpty()){
    T item = anotherQueue.dequeue();
    this.enqueue(item);
}

