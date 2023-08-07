package org.tnsif.interfacedemo;
//interface which contain exactly one abstract method-"functional interface"
/*below annotation ensures that you have to use exactly one abstract 
 * method inside an interface
 */
@FunctionalInterface
public interface PopCorn {
	//abstract method
	void displayRecipe();
	//void display();	

}
