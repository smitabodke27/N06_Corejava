package org.tnsif.looping;

import java.util.Scanner;

public class TotalNumDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		String num=s.next();
		
		int count=0;
		int n= num.length();
		
		for(int i=1;i<=n;i++)
		{
			count++;
		}
		System.out.print(count);
		
	}

}
