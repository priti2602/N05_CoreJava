package org.tnsif.finalkeyword;
//program to demonstrate on final keyword with variable

public class FinalVariable {
	//The blank final field num may not have been initialized
	//final int NUM;
	final float SALARY=88993.34f;
	
	public void print()
	{
		//we can't change the value of final variable
		//SALARY=88993.38f;
		System.out.println("Salary is: "+SALARY);
	}

}
