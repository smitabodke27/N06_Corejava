package org.tnsif.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{
		//calling to parameterized
		this(7);
		System.out.println("Default constructor");
	}
	Team(int size)
	{
		System.out.println("parameterized constructor:"+size);
	}
}
public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team t=new Team();

	}

}
