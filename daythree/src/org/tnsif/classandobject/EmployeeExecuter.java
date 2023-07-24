//program to demonstrate on class and objects
package org.tnsif.classandobject;

public class EmployeeExecuter {

	public static void main(String[] args) {
		//object creation
		Employee e=new Employee();
		e.empId=132515;
		e.empName="smita bodke";
		e.salary=78000;
		e.department="comp";
		//method call
		e.display();
		

	}

}
