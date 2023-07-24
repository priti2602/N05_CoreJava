//Program to demonstrate on  continue statement

package org.tnsif.jumpingstatement;

public class ContinueExecutor {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			else
				System.out.println(i+" ");
		}

	}

}
