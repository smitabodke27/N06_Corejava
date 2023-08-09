package org.tnsif.singledimenstionalarray;
//program to demonstrate on Arrays of objects
public class Employes {
	private int ID;
	private String name;
	private double salary;
	
	//private data members
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//prameterized constructor
	public Employes(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
}
