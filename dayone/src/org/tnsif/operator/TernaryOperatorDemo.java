// program to demonstrate ternory operator
package org.tnsif.operator;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("result is:"+result);
		s.close();

	}

}
