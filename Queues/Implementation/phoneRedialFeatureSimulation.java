/* Simulate redial features of a phone */

final String PERIOD = ".";

Queue<String> q = new LinkedList<String>();

System.out.println("Enter digits of a phone number separated by spaces");
System.out.println("Terminate with a space and then a period.");
String digit = keyboard.next(); //read user input

while (!digit.equals(PERIOD)){
  q.add(digit);
  digit = keyboard.next();
}

System.out.println();
System.out.println("The number dialed was: " );
while (!q.isEmpty()){
  System.out.print(q.remove());
}

