package org.tnsif.multilevelinheritance;
//child class1
//parent class2
public class TeamLead extends Manager {
	//private data members
	private String leadName;
	private int empID;
	private String projectName;
	
	//getters and setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamLead [leadName=").append(leadName).append(", empID=").append(empID).append(", projectName=")
				.append(projectName).append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}
	
	
	//parameterized constructor
	public TeamLead(String deptName, String name, int empid,String leadName,int empID,String projectName) {
		super(deptName, name, empid);
		this.empID=empID;
		this.leadName=leadName;
		this.projectName=projectName;
	}
	
	
	
	
	
	

}
