//driver class
//program to demonstrate on default and parameterized
package org.tnsif.classandobject;

public class LibraryExecuter {

	public static void main(String[] args) {
		//object creation
		Library l=new Library();
		Library l1=new Library(5, "vishal lichade", "java programing", 250.56);
		System.out.println(l1);
		
	}

}
