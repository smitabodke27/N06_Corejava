package org.tnsif.singledimenstionalarray;

public class ArraysOfObjectDemo {

	public static void main(String[] args) {
	
		Employes arr[]=new Employes[3];
		arr[0]=new Employes(101,"smita",67000.45);
		arr[1]=new Employes(102,"niharika",66000.45);
		arr[2]=new Employes(103,"kimaya",65000.45);
		for(int i=0;i<3;i++)
		{
			System.out.println(+arr[i].getID()+"  "+arr[i].getName()+"  "+arr[i].getSalary()+" ");
		}
	}

}
