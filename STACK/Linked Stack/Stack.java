public class Stack
{
          //Method to remove the top element of the stack.
        //Precondition: The stack exists and is not empty.
        //Postcondition: The stack is changed and the top
        //               element is removed from the stack.
        //               If the stack is empty, the method throws
        //               StackUnderflowException
    public void pop( ) throws StackUnderflowException
    {
        if (stackTop == null)
            throw new StackUnderflowException( );

        stackTop = stackTop.link;  //advance stackTop to the next node
    }//end pop
}  //en	private Node head;

	public Stack( )
	{
		head = null;
	}

	
	public void push(String itemName)
	{
		head = new Node(itemName, head);
	}

	
	public String pop( )
	{
		if (head == null)
			throw  new IllegalStateException( );
		else
		{
			String returnItem = head.item;
			head = head.link;
			return returnItem;
		}
	}


	public boolean isEmpty( )
	{
			return (head == null);
	}
}

