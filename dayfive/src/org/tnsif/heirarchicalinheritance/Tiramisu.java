package org.tnsif.heirarchicalinheritance;
//child class1
public class Tiramisu extends Android {
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
		builder.append("Tiramisu [version=").append(version).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}
	
	
    //default constructor
	public Tiramisu() {
		super();
		
	}
	
	
    //parameterized constructor
	public Tiramisu(String brandName, String slotType, int version) {
		super(brandName, slotType);
		this.version=version;
	}

	

	
	
	

}
