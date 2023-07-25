//Program to demonstrate on default and parameterized constructor

package org.tnsif.classandobject;

public class Citizen {
	  //data members
      String citizenType;
      Long aadharNo;
      String gender;
      String city;
     //default constructor 
	public Citizen() 
	{
		  System.out.println("Demonstration on default constructor");
	}
    //parameterized constructor
	public Citizen(String citizenType, Long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
		
	}
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
      
      
      
}
