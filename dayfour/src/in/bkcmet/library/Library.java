//program to demonstrate on access specifier
package in.bkcmet.library;

public class Library {
	//different access specifier
	public String libraryName;
	private long userId;
	String booksName;
	
	//public method 
	public void displayPublic()
	{
		System.out.println("library name: "+libraryName);
	}
	private void displayPrivate()
	{
		System.out.println("user id:"+userId);
	}
	void displayDefault()
	{
		System.out.println("bookname:"+booksName);
	}

}
