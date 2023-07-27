package org.tnsif.heirarchicalinheritance;
//base class
public class Android {
	//private data members
	private String brandName;
	private String slotType;
	
	//getters and setters
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Android [brandName=").append(brandName).append(", slotType=").append(slotType).append("]");
		return builder.toString();
	}
	
	//default constructor
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	
	
	

}
