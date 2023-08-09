package org.tnsif.unchakedexception;
//program to demonstrate on catch block with multiple exception class
public class CatchBlockDemo {
	static void print(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}	
		//we can use multiple catch block in program
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("EXception handled"+e);
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);
	}

}
