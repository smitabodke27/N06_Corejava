package org.tnsif.unchakedexception;
//program to demonstrate arithmetic exception
import java.util.Scanner;

public class ArithmeticExceptionExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains an exception code
		try {
		System.out.println(x/y);
			}
		//catch block is use to handle that exception
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
	}

}
