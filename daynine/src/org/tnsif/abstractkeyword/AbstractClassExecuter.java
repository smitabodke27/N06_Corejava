package org.tnsif.abstractkeyword;

public class AbstractClassExecuter {

	public static void main(String[] args) {
		//we cant create the object for abstract class
		//Sandwich s=new Sandwich();
		CheeseCornSandwich s=new CheeseCornSandwich();
		s.prepare();
		s.showReceipe();

	}

}
