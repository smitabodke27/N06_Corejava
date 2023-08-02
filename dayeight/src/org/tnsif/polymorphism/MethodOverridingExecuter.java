package org.tnsif.polymorphism;
class ChiefMinister
{
	static void corruption(String str1, float amount)
	{
		System.out.println(str1+"Courrupted the amount of"+amount);	
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2, float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde",26452.152f);
		System.out.println(str2+"Courrupted the amount of"+amount2);	
	}
}
public class MethodOverridingExecuter {

	public static void main(String[] args) {
		MLA.corruption("Banwarilal Purohit",15623.45f);

	}

}
