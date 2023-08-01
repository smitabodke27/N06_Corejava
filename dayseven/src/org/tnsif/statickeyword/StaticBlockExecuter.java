package org.tnsif.statickeyword;

public class StaticBlockExecuter {
	
	 String str="BKC";
	static float salary;
	/*static block is used to initialized static variable and we cannaot initialized any non static varaible inside the static block*/
	static {
		salary=768689.2f;
		//str="BKC";
		
	}
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		print();

	}

}
