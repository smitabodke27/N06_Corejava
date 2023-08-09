package org.tnsif.unchakedexception;
//program to demonstrate finally block not executed
public class FinallyBlockNotExecutedDemo {

		static void display(int arr[])
		{
			try {
			System.out.println(arr[3]);
			/*1.if try and catch block contains a System.exit(0); 
			then after the exception code line then finally block does not execute*/
			System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handles"+e);
				System.exit(0);
			}
			finally
			{
				//when finally block contains an exception code, then finally block doen not executed
					System.out.println(13/0);
				System.out.println("Finally block is always executed");
			}
			System.out.println("any statement out of thr block is always"+"executed");
		}
			
		public static void main(String[] args) {
			int arr[]= {12,6,89};
			display(arr);
		}

	

}
