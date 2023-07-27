package org.tnsif.multilevelinheritance;
//child class1
public class TeamMember extends TeamLead{
	
	private  int size;
	private int duration;
	
	public TeamMember(String deptName, String name, int empid, String leadName, int empID2, String projectName,int size,int duration) {
		super(deptName, name, empid, leadName, empID2, projectName);
		this.size=size;
		this.duration=duration;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamMember [size=").append(size).append(", duration=").append(duration).append(", toString()=")
				.append(super.toString()).append("]");
		return builder.toString();
	}
	
	
	
	

}
