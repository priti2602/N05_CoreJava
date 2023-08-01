package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	static float salary;
	String comapnyName;
	
static {
	//comapnyName="Accenture";
	salary=88765.89f;
}
//static method
static void print()
{
	System.out.println(salary);
}

	public static void main(String[] args) {
		
		print();

	}

}
