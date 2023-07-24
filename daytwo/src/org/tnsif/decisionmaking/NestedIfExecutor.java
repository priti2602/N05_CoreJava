//Program to demonstrate on bunjee jumping usingNested if

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{		
		if(weight>=50 )
		{
			System.out.println("Eligible");
			if(weight>110)
			{
				System.out.println("extra ropes will be added");	
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}
		else
		{
			System.out.println("not eligible");
		}

}
}
