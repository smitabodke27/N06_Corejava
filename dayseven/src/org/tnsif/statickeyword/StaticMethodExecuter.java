package org.tnsif.statickeyword;

public class StaticMethodExecuter {
	String str="BKC";
	static float percentage=78.9f;
	//static method
	/*if any method outside the main function and if you want to access that method inside the main functin make it static */
	static void displyScore(int score)
	{
		System.out.println(percentage);
		/*we cant use non-static variable inside static method */
		System.out.println("Score is:"+score);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displyScore(56);
	}

}
