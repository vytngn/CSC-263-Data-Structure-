public class QueueClass<T> implements QueueADT<T>
{
    private int maxQueueSize;
    private int count;
    private int queueFront;
    private int queueRear;
    private T[ ] list;  //Array of references to the
                              //objects that store queue elements
//Create an array of the size 100 and set maxQueueSize to this size. 
       //Default constructor
       //Postcondition: Creates the array of references to the
       //               objects that store queue elements.
       //               maxQueueSize = 100;
       //               count = 0; queueFront = 0;
       //               queueRear = maxQueueSize - 1;
    public QueueClass( )
    {
        maxQueueSize = 100;
        queueFront = 0;			//initialize queueFront
        queueRear = maxQueueSize - 1;	//initialize queueRear
        count = 0;
        list = (T[ ]) new Object[maxQueueSize];  //create the
                                             //array to implement the queue
    }
    //Constructor with a parameter
       //Postcondition: Creates the array of references to the
       //               objects that store queue elements.
       //               maxQueueSize = queueSize;
       //               count = 0; queueFront = 0;
       //               queueRear = maxQueueSize - 1;
       //               If queueSize <= 0, maxQueueSize = 100;



    public QueueClass(int queueSize)
    {
        if (queueSize <= 0)
        {
            System.err.println("The size of the array to "
                                        + "implement the queue must be positive.");
            System.err.println("Creating an array of the size 100.");

            maxQueueSize = 100;
        }        
        else
            maxQueueSize = queueSize; //set maxQueueSize to queueSize

        queueFront = 0;                            //initialize queueFront
        queueRear = maxQueueSize - 1;   //initialize queueRear
        count = 0;
        list = (T[ ]) new Object[maxQueueSize]; //create the
                                                                  //array to implement the queue
    }


       //Method to initialize the queue to an EMPTY state.
       //Postcondition: count = 0; queueFront = 0;
       //               queueRear = maxQueueSize - 1
    public void initializeQueue( )
    {
        for (int i = queueFront; i < queueRear; i = (i + 1) % maxQueueSize)
        list[i] = null;

        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
    }
//Method to determine whether the queue is empty.
       //Postcondition: Returns true if the queue is empty;
       //                                    otherwise, returns false.
    public boolean isEmptyQueue( )
    {
        return (count == 0);
    }

       //Method to determine whether the queue is full.
       //Postcondition: Returns true if the queue is full;
       //                                    otherwise, returns false.
    public boolean isFullQueue( )
    {
        return (count == maxQueueSize);
    }



       //Method to return the first element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: If the queue is empty, the method
       //               throws QueueUnderflowException;
       //               otherwise, a REFERENCE to a copy of
       //               the first element of the queue is returned.




    public T front( ) throws QueueUnderflowException
    {
        if (isEmptyQueue( ))
            throw new QueueUnderflowException( );

        return (T) list[queueFront];
    }


       //Method to return the last element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: If the queue is empty, the method
       //               throws QueueUnderflowException;
       //               otherwise, a REFERENCE to a copy
       //               of the last element of the queue is returned.
    public T back( ) throws QueueUnderflowException
    {
        if (isEmptyQueue( ))
            throw new QueueUnderflowException( );

        return (T) list[queueRear];
    }


       //Method to add queueElement to the queue.
       //Precondition: The queue exists and is not full.
       //Postcondition: The queue is changed and queueElement
       //                       is added to the queue.
    public void addQueue(T queueElement) throws QueueOverflowException
    {
        if (isFullQueue( ))
            throw new QueueOverflowException( );

//use mod operator to advance queueRear because the array is circular
        queueRear = (queueRear + 1) % maxQueueSize; 
        count++;
        list[queueRear] = queueElement;
    }
//Method to remove the first element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: The queue is changed and the first
       //               element is removed from the queue.
    public void deleteQueue( ) throws QueueUnderflowException
    {
        if (isEmptyQueue( ))
            throw new QueueUnderflowException( );

        count--;
        list[queueFront] = null;

        //use mod operator to advance queueFront because the array is circular
        queueFront = (queueFront + 1) % maxQueueSize; 
    }
}

  

