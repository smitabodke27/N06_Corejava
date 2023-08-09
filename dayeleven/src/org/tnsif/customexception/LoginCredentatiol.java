package org.tnsif.customexception;

//program to demonstrate on custom exception
//to use custom exception extend an exception class 
public class LoginCredentatiol extends Exception {
	
	private String str;
	
	//getter and setter
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	//parameterized constructor
	public LoginCredentatiol(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "LoginCredentatiol [str=" + str + "]";
	}
	
	
}
