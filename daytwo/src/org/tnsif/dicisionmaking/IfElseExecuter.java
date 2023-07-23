// program to demonstarte on  to check the person is eligible to donate blood or not
package org.tnsif.dicisionmaking;
import java.util.Scanner;

public class IfElseExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("eligible to donate blood");
		}
		else
		{
			System.out.print("not eligible");
		}

	}

}
