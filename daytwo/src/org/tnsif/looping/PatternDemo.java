package org.tnsif.looping;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
