package org.tnsif.instanceofdemo;
class RBI
{
	protected String ifscCode;
}
class SBI extends RBI
{
	public SBI() {
		super.ifscCode="RBISONGPA01";
		String ifscCode="SBIN002161";
		System.out.println(ifscCode);
		/*if paretn class and child class variables are same use super.variablename to access that variable of parent class inside the child class */
		System.out.println(super.ifscCode);
	}

}

//program to demonstrate instance of operator
public class InstanceofDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
