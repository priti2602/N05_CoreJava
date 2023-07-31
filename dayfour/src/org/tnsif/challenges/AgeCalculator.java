package org.tnsif.challenges;
/*Ask a user for their birth year encoded as 2 digit(like "62") and for the current
 year,also encoded as 2 digit(like "99").Write a program to find the users
 current age in years.
 */

import java.util.Scanner;

public class AgeCalculator {
	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
		{
			System.out.println(cy-by);
		}
		else
		{
			System.out.println((100-by)+cy);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the birth year and"+"current year");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);
		
		s.close();
	
	

}
}