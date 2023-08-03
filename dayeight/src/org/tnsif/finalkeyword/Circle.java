package org.tnsif.finalkeyword;

public class Circle extends Shape {

	final float AREA=44.9f;
	//final method
	//cannot override final method
	/*void printShapeType()
	{
		System.out.println(AREA +"sq.cm");
	}*/
	public void printShapeType(float AREA)
	
	{
		System.out.println(AREA +"sq.cm");
	}
}
