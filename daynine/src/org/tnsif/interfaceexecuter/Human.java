package org.tnsif.interfaceexecuter;
//implementable class or child class
public class Human implements ColdDrink,AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println(colddrinkName+" "+alcoholType+" "+brand);
		
	}

}
