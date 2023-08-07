package org.tnsif.interfacedemo;
//implementable class or child class
public class Person implements ColdDrink,Alcohol {

	@Override
	public void showDrinkName() {
		System.out.println(brand+" "+alcoholName+" "+name);
		
	}


}
