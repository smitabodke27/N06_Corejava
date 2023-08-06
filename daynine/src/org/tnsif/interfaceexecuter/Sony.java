package org.tnsif.interfaceexecuter;
//program to demonstrate on an interface
public interface Sony {
	/*by default all the variables inside an interface is public static final*/
	int noOfChannels=8;
	//by default all the method inside an interface in an abstract method 
	void display();
	/*java 8 provide a static and default method inside an interface */
	//static method
	static void accept()
	{
		System.out.println("Static method");
	}
	//default method
	default void show()
	{
		System.out.println("Deafult method");
	}
}
