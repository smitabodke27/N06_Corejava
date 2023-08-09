package org.tnsif.customexception;

import java.util.Scanner;

public class CustormExceptionExecuter{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		
		try {
				if(userid.equals("smitabodke12@tnsif.org") && password.equals("password@123"))
				{
					System.out.println("Credential are matched");
				}
				else
				{
					throw new LoginCredentatiol("invalid credential");
				}
		}
		catch(LoginCredentatiol e)
		{
			System.out.println("Exception handled"+e);
		}

	}

}
