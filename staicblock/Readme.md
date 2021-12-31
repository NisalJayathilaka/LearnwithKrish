# Static Methods and static

Static is a class-level type. When we load the class to the JVM, static will be called. We can use the static for the memory management this will be an advantage but with the static, we can’t create multiple instances. 
To access static we can use the class Name. when we use the static we can access that variable or methods globally.  
Look at this example:-  with this you can get a clear idea about static access. We can use the instance also for the access the static but with the instance get our memory. 

# Example
<img width="366" alt="Screenshot 2021-12-31 at 15 03 45" src="https://user-images.githubusercontent.com/36580957/147815524-70a9e645-a3e7-45ae-9c85-d832b8930ed1.png">
<img width="459" alt="Screenshot 2021-12-31 at 15 04 56" src="https://user-images.githubusercontent.com/36580957/147815579-45837717-d7b4-4f70-9d88-e648ec65b753.png">


When we change the reference value to the null static variable it does not affect that because it belongs to the class level. 
We can’t access non-static methods in the static methods. We can’t use this keyword in the static block. The static method is called one time when the class loader. We can create a static variable at the class level only. 
Static variables are stored in a class area. only a single copy of the static variable is created and shared among all the instances of the class. Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.


# Empty block

An empty block will be called when creating an object. If not it will not be executed. Both static and non-static variables can be added to the empty block. It will be called before executing the constructor but it will execute after the static block. 


# Static block

Static block called the classloader will load the class. But it needs an object to execute. Only static variables can be defined in the static block.


# Constructors

Constructors are a special type of method that doesn’t have a return type and the name should be a class name. We used constructors for getting the information in the initial step or providing the information in the initial step.  In constructors, we have default constructors and parameterized constructors. 
In constructors, we must have the class name and the return type should not apply. Java doesn’t have copy constructors.
Constructors are called when the object is created. We can do constructors overloading also (To that we use different parameters). 
