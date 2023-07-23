// program to demonstrate switch cases 
package org.tnsif.dicisionmaking;

import java.util.Scanner;

public class SwitchExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the song number:");
		int songno=s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.print("Blank space");
				break;
			case 2:
				System.out.print("Love story");
				break;
			case 3:
				System.out.print("Love me like you do");
				break;
		}

	}

}
