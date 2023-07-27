package org.tnsif.singleinheritance;
//derive/child class
public class Student extends Citizen {
	
	//private data members
	private int rollNo;
	private String collegeName;
	public Student() {
		//super()-it calls to parent class default constructor
		super();
		System.out.println("child class default constructor");
		
	}
	
	//parameterized constructor
	public Student(String city, int pincode, long aadharNo, long contactNo,
			int rollNo,String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo="+rollNo+",collegeName="+collegeName+",toString()="+super.toString()+"]";
	}

	

	
	
	
	
	
	
	
	
	

}
