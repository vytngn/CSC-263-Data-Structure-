1.	LockADT – Show the interface and all abstract methods
LockDataStructureClass – Show the following methods: default constructor, overloaded constructor, copy constructor, setX, setY, setZ, alter (change the lock’s combination to the numbers passed) turn (use for loops to show the dial turning), close (locks the lock), attempt (tries to unlock the lock – calls turn( ), inquire (locked or unlocked), current (returns the number the dial is pointing to), toString
LockClientDemoClass – You should have a Lock object instantiated and a menu method that displays: 
1: set lock combination  
2: close lock   
3: check status  
4: attempt to open lock
5: check what the dial is currently pointing at 
6: exit the program

Example of turning the lock:
First number (17):  0 39 38 37 … 0 39 38 …17
Second number (26): 17 18 19 ... 38 39 0 1 2 … 17 18 19 20 21 22 23 24 25 26 
Third number (9): 26 25 24 23 …. 12 11 10 9 (go directly to the number)

Demonstrate all behaviors (actions, methods) of the lock.
1.	Specify, design, and implement a class that can be used in a program that simulates a combination lock. The lock has a circular knob with the numbers 0 through 39 marked on the edge, and it has a three-number combination, which we will call x, y, and z.
In order to open the lock, you must turn the knob clockwise at least one entire  revolution, stopping with x at the top; then you turn the knob counterclockwise, stopping the “second” time that y appears at the top; finally, you turn the knob clockwise again, stopping the next time that z appears at the top. At this point, you may open the lock.
Your “Lock” class should have a constructor that initializes the 3-number combination (use 0, 0, 0 for default arguments in the default constructor).
Also, provide the following methods:
a)	To alter the lock’s combination to a new 3-number combination
b)	To turn the knob in a given direction until a specified number appears at the top. (You also must show all of the numbers in the output as the lock is being turned – could use a for loop)
c)	To close the lock
d)	To attempt to open the lock
e)	To inquire about the status of the lock (open or shut)
f)	To tell what number is currently at the top
Write a complete Java program that uses all of the above methods in the output.


