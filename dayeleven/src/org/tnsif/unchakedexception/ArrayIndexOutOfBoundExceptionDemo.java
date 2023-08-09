package org.tnsif.unchakedexception;
//program to demonstrate array index out of bound
public class ArrayIndexOutOfBoundExceptionDemo {
	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handles"+e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("any statement out of thr block is always"+"executed");
	}
		
	public static void main(String[] args) {
		int arr[]= {12,6,89};
		display(arr);
	}

}
