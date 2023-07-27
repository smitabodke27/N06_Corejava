//driver class
//program to demonstrate on access specifier
package in.kkwagh.library;

import in.bkcmet.library.Library;
//import in.bkcmet.library.*;

public class FacultyExecuter {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="Bhujbal library";
		l.displayPublic();
		
		/* userId and displayPrivate() method id private, so we can't access into another package or class , only we can access inside the same class*/
		//l.userId=1234654l;
		//l.displayPrivate();
		
		
		//books name and dispalayDefault() method id default, we can't access into another package , only we can access it within the same package
		//l.booksName();
		//l.displayDefault();
	}

}
