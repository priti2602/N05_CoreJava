package org.tnsif.heirarchicalinheritance;

public class SnowCone extends Android {
	//private data member
	private int version;
    
	//getters and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
    //to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SnowCone [version=").append(version).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}

	
    //parameterzied constructor
	public SnowCone(String brandName, String slotType,int version) {
		super(brandName, slotType);
		this.version=version;
	}
	
	

}
