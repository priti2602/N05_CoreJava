//driver class
//Program to demonstrate on Class and objects

package org.tnsif.classandobject;

public class SandwichExecutor {

	public static void main(String[] args) {
		//object creation
		Sandwich s=new Sandwich();
		s.breadType="Brown bread";
		s.noOfSlice=4;
		//method call
		s.display();

	}

}
