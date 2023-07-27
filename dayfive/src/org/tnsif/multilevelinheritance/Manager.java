package org.tnsif.multilevelinheritance;
//parent class1(super class)
public class Manager {
	//private data members
	private String deptName;
	private String name;
	private int empid;
	
	//default constructor
	public Manager() {
		System.out.println("Default constructor -manager");
	}

	//parameterized constructor
	public Manager(String deptName, String name, int empid) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empid = empid;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [deptName=").append(deptName).append(", name=").append(name).append(", empid=")
				.append(empid).append("]");
		return builder.toString();
	}

	
	//getters and setters
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	
	
	
	
	
	
	
	

}
