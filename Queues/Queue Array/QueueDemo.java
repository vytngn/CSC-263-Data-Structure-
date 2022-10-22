public class QueueTestDemo
{
    public static void main(String[ ] args)
    {
     QueueClass<Integer> intQueue = new QueueClass<Integer>( );

        intQueue.addQueue(23);
        intQueue.addQueue(45);
        intQueue.addQueue(38);

        System.out.print("intQueue elements: ");

        while (!intQueue.isEmptyQueue( ))
        {
            System.out.print(intQueue.front( ) + " ");
            intQueue.deleteQueue( );
        }

        System.out.println( );
    }
}
