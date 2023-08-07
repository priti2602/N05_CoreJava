package org.tnsif.interfacedemo;

public interface DebitCard {
/*by default all the variables inside an interface is public static final
* and if it is final then we must have to initialize value for that variable*/
	long cardno=87654321898L;
//we can't use concrete method inside an interface
//by default,method inside an interface is an abstract
	void displayCardDetails();
//default method and static method are new features of java8 inside an interface
	default void display()
	{
		System.out.println("Default method");
	}
//static method
    static void print()
    {
    	System.out.println("Static method");
    }
}
