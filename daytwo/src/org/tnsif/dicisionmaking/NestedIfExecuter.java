// program to demonstrate on bunjee jumping using nested if
package org.tnsif.dicisionmaking;

import java.util.Scanner;

public class NestedIfExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(weight >=12)
		{
				if(weight>=40)
				{
					System.out.print("eligible for bunjee jumping");
					if(weight>=110)
					{
						System.out.print("\n extra ropes will be added");
					}
				}
				else
				{
					System.out.print("not eligible");
				}
			
		}
		else
		{
			System.out.print("not eligible");
		}

	}

}
