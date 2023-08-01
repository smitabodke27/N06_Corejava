package org.tnsif.superkeyword;
//program to demonstrate 
//parent class
class MET{
	String ownerName="chagan Bhujbal";
	void displayName()
	{
		System.out.println("owner is:"+ownerName);
	}
}
//child class
class BKC extends MET{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/*if parent class and child class method name are same and if you want to access that method then use super.methodName();*/
		super.displayName();
		System.out.println("owner is:"+ownerName);
	}
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();
	}

}
