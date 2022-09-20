Node buildListForward {
	
	//variable declaration
	Node first,newNode, last;
	int num;
	
	System.out.println("Enter integers ending with -999: ");
	num = console.nextInt(); // read and store a number in num
	
	
	first=null;
	
	while(num !=-999) {
	  /*allocate memory of the type Node 
	   * and store the address of the allocated memory in newNode */
		newNode = newNode(); 
		
		//copy the value of num into the info field of newNode 
		newNode.info = num; 
		
		//initialize the link field of newnode to null
		newNode.link = null;
		
			/*if (first is null), 
			 * the list is empty;
			 *  {make first and last pointer to newNode}
			 */
			if(first == null) {
				first = newNode;
				last = newnode;
			/*else( list is not empty)
			 * {insert newnode at the end of the list
			 * set last so that it points to the actual node in the list }
			 */
			}else {
				last.link = newNode;
				last = newNode;
			} //end if else
		num = console.nextInt();
	} //end while 
	return first;
}//end buildListForward 
