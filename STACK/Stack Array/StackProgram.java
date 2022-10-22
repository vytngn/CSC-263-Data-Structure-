public class StackProgram
{
    public static void main(String[ ] args)
    {
        StackClass<Integer> intStack = new StackClass<Integer>(50);	//Line 1

        try										//Line 2
        {
            intStack.push(23);							//Line 3
            intStack.push(45);							//Line 4
            intStack.push(38);							//Line 5
        }
        catch (StackOverflowException sofe)				//Line 6
        {
            System.out.println(sofe.toString( ));				//Line 7
            System.exit(0);							//Line 8
        }
        System.out.print("intStack elements: ");			//Line 9

        while (!intStack.isEmptyStack( ))					//Line 10
        {
            System.out.print(intStack.peek( ) + " ");			//Line 11
            intStack.pop( );
        }
        System.out.println( );						//Line 12
    }
}
