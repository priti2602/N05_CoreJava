package org.tnsif.statickeyword;

public class Tiger extends Animal {
	void eat()
	{
		System.out.println("eating:child");
	}
	static void run()
	{
		//we can't override static method
		//super.run()
		System.out.println("running:child");
	}

}
