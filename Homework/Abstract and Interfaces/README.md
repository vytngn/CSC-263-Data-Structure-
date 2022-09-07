
In the following example, draw all classes and interfaces to show the relationships.
- Write the code to do the following:
- Define a structure that can represent SweetFood. 
- SweetFood has two behaviors; it can sugarBoosts( ) and it can raiseCalories( ). By default, when a 
SweetFood sugarBoosts, the message “This SweetFood sugarBoosts” is displayed. By default, when a 
SweetFood raiseCalories, the message ”This SweetFood raiseCalories” is displayed. 
- A general SweetFood cannot be instantiated. 
- Define also two classes, Candy and Cake, which are a SweetFood. Both Candy and Cake behave such 
that when ”SweetFood” is displayed in raiseCalorie( ) or sugarBoost( ), ”Candy” or ”Cake” is displayed 
by the appropriate classes. Define the default constructors to accomplish this.
- Finally, any instance of Cake can bake( ), just as any Bakable object can.
- A Potato is also a Bakable object. Define the Potato class such that it is Bakable and make sure that any 
instance of Cake is also Bakable. The specific behaviors when instances of either class bake( ) are up to 
you. 
Instances of Cake should display in the message:  the class name and name of object rises and gets fluffy! 
Instances of Potato should display in the message:  the class name and name of object browns and gets 
crispy. ((Use getClass( ) and getName( ) for class name and object name, respectively)
- Instances of either Cake or Potato should be able to be stored in a variable of type Bakable.
