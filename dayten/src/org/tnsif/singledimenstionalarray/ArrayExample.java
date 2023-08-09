package org.tnsif.singledimenstionalarray;
//program to demonstrate single or 1D array using compile-time input
public class ArrayExample {

	public static void main(String[] args) {
		//array initialization at compile time
		int arr[]= {66,33,21,6,1};
		System.out.println(arr[1]);
		System.out.print("Array elements are:");
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}

	}

}
