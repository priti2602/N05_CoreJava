//to invoke or initiate the current class constructor

package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	//default constructor
	ThisKeywordDemoFour()
	{
		//invoking current parameterized constructor
		this(34);
		System.out.println("Default constructor");
	}
	
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("parameterized constructor :" +x);
	}

	public static void main(String[] args) {
		ThisKeywordDemoFour f=new ThisKeywordDemoFour();

	}

}
