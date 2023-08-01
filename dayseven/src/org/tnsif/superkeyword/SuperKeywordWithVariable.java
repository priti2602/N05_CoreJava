package org.tnsif.superkeyword;
//parent class
class State
{
	String stateName="Punjab";
	
}
//child class
class Capital extends State
{
	String stateName="Hariyana";
	String capital="Chandigarh";
	
	public void display()
	{
	/*super keyword with variable is used to call parent class variable if and
	 * only if parent and child class variable name are same
	 */
		System.out.println(super.stateName);
		System.out.println(stateName);
	}
	
}
//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.display();

	}

}
