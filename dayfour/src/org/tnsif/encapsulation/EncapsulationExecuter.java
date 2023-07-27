package org.tnsif.encapsulation;

public class EncapsulationExecuter {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("saving accout");
		h.setAccountNo(132456987561L);
		h.setAtmCardNo(123456987555L);
		h.setPinNo(1221);
		
		
		//System.out.println("Account No.is:"+h.getAccountNo());
		//below line will call toString(method)
		System.out.println(h);

	}

}
