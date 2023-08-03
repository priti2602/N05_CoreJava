package org.tnsif.finalkeyword;
//program to demonstrate on final method
//we can't inherit final class
//public final class Shape
public class Shape {
	
	final String shapeName="Circle";
	//final method
	final void printShapeType()
	{
		System.out.println(shapeName);
	}

}
