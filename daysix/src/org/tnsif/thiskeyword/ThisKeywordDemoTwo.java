//this can be passed as an argument in the constructor call
package org.tnsif.thiskeyword;

public class ThisKeywordDemoTwo {

		//default variable
		int x,y;
				
		//constructor
		public ThisKeywordDemoTwo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
	}
		void display()
		{
			System.out.print(x+"  "+y);
		}
			
		public static void main(String[] args) {
			ThisKeywordDemoTwo t=new ThisKeywordDemoTwo(2,3);
			t.display();
			
					}

	}
