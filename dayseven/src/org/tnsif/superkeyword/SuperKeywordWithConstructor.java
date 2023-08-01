package org.tnsif.superkeyword;
//program to demonstrate on super constructor
class Google
{
	String ceo;

	public Google(String ceo) {
		System.out.println("Default constructor:"+ceo);
	}
	
	
}
class Gmail extends Google
{
	String userid;

	public Gmail(String ceo, String usrid) {
		//calling to parent class parameterized constructor 
		super(ceo);
		this.userid = usrid;
		System.out.println(userid);
	}
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g=new Gmail("Sundr Pichai","abc@gmail.com");

	}

}
