package org.tnsif.finalkeyword;

public class HP extends Laptop {
	final String procceseor="Intel I7";
	
	//we cant override final method
	/* void display()
	{
		System.out.println(proccesor);
	}*/
	void display(String proccesor)
	{
		System.out.println(proccesor);
	}
	
}

