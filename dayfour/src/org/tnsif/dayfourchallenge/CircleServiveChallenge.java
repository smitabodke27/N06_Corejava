/* there are n people standing in a circle waiting to be executed . 
 * the counting out begins at some point in the circle and proceeds around the circle in a fix direction .
 * in each step a certain number of people are skip and the next person is executing .
 * the elimination proceed around the circle(which is becoming smaller and smaller as executed people are remove ), until only the last person remains , who is given freedom
 *given: total no of person n and a number k which indicates that k-1 person are skip and the kth person is killed in circle the task is to choose the person in the initial circle that su
 *rvive.*/
package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleServiveChallenge {
	
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENter the value for n & k:");
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n, k));

	}

}
