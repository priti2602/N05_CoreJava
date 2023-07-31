//Program to demonstrate on access specifiers

package org.tnsif.accessspecifier;

public class Bank {
	//different access specifiers
	public String bankName;
	private int pinNo;
	long accountNo=757544352677842L;
	
	//Public method
	public void displayPublic()
	{
		System.out.println("Bank name is:"+bankName);
	}
	
	//Private method
	private void displayPrivate()
	{
		System.out.println("Pin no is:"+pinNo);
	}
	
	//Default method
	void displayDefault()
	{
		System.out.println("Account no is:"+accountNo);
	}

}
