package org.tnsif.interfacedemo;
//driver class
//program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//Cannot instantiate the type DebitCard
		//DebitCard d=new DebitCard();
		SBIDebitCard s=new SBIDebitCard();
		/*print is a static method inside an interface ,to call print method 
		 * we have to use interfacename.methodname();*/
		
		s.displayCardDetails();
		/*we can call default method of an interface using 
		 * the obj of implementable class*/
		s.display();
		DebitCard.print();
		
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayRecipe();	
		
		Person p=new Person();
		p.showDrinkName();

	}

}
