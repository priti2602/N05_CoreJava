//Program to demonstrate on encapsulation
/* encapsulation achieves the data by hiding using private
  access specifiers*/
//Driver class= which contains main function

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccounNo(99887766554433L);
		h.setAccountType("Current");
		h.setCvvNo(999);
		h.setPinNo(2602);
		
		/*
		System.out.println(h.getAccounNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());*/
		System.out.println(h);

	}

}
