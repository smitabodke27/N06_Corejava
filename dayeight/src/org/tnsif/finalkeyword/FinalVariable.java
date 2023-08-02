//program to demonstrate on final variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	/*final variable must be initialized during declaration*/
	//final int x;
	final float SALARY=670000.78f;
	
	void print()
	{
		/*we cant change the value of final variable*/
		//SALARY=89000.76f;
		System.out.println("salary is:"+SALARY);
	}
}
