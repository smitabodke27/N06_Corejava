package org.tnsif.singledimenstionalarray;

import java.util.Arrays;
import java.util.Scanner;

/*program to demonstrate on array using runtime input values and to fine largest element in an array*/
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter total array elements");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");//12 3 23 7 1
			
		}
		int max=arr[0];//23 
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("\n Largest element is:"+max);
		Arrays.sort(arr);
		System.out.println("\n sorted element is:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
