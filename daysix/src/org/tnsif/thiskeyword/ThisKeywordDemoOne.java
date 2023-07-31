//It can be used to refer instance variable of the current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	
//default variable
	int x,y;
	
	void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	void display()
	{
		
		System.out.print(x+"  "+y);
	}

	public static void main(String[] args) {
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setData(2,3);
		t.display();
		

	}

}
