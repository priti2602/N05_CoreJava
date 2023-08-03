package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		//FINAL VARIABLE
		FinalVariable f=new FinalVariable();
		f.print();
		
		//FINAL METHOD
		Circle c=new Circle();
		c.printShapeType();
		c.printShapeType(c.AREA);
		
		
	}
	

}
