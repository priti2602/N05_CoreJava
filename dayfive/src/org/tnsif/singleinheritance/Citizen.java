package org.tnsif.singleinheritance;
//base class
public class Citizen {
	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNo;
	
	
	//defualt constructor
	public Citizen() {
		System.out.println("Defualt constructor");
	}
	
	
	//parameterized constructor
	public Citizen(String city, int pincode, long aadharNo, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		
	System.out.println("parameterized constructor");
	}



	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Citizen [city=").append(city).append(", pincode=").append(pincode).append(", aadharNo=")
				.append(aadharNo).append(", contactNo=").append(contactNo).append(", getCity()=").append(getCity())
				.append(", getPincode()=").append(getPincode()).append(", getAadharNo()=").append(getAadharNo())
				.append(", getContactNo()=").append(getContactNo()).append(", getClass()=").append(getClass())
				.append(", hashCode()=").append(hashCode()).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}
	
	
	
	

}
