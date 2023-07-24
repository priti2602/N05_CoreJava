//Program to demonstrate on Switch cases

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Perfect");
			break;
		case 2:
			System.out.println("Kesariya");
			break;
		case 3:
			System.out.println("Night changes");
			break;	
		default:
			System.out.println("Invalid input");
			
		}
		s.close();

	}

}
