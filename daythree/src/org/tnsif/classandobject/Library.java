//program to demonstrate on default and parameterized
package org.tnsif.classandobject;
//class declaration
public class Library {
	
	public long noOfBooks;
	public String suthorName;
	public String bookName;
	public double price;
	//default constructor
	public Library() {
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Library(long noOfBooks, String suthorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.suthorName = suthorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("parameterized constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", suthorName=" + suthorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	
	
	
}
