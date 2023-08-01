package org.tnsif.superkeyword;
//program to demonstrate on super keyword with variable
class Building 
{
	int floors=23;
	String name="Anantha-Astha";
}
class Flats extends Building
{
	String name="Smita bodke";
	
	void print()
	{
		/*if parent class and child class variables are same and if you want to access the parent class variable inside child class , use super.variablename*/
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flats f=new Flats();
		f.print();

	}

}
