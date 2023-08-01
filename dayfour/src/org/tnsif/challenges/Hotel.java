/*1.  Write a program to calculate the hotel tariff .
   The room rent is 20% high during peek
  seasons (april to june is peek season and November to dec peek season ) 
 * note : use the switch cases
 * Sample ip month=3(march) ,rent =1500 ,day = 2days calculate hotel budget
 * 
 * 
 *    
 * */
package org.tnsif.challenges;

import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the month (1-12): ");
		        int month = input.nextInt();

		        System.out.print("Enter the room rent per day: ");
		        float rent = input.nextFloat();

		        System.out.print("Enter the number of days of stay: ");
		        int days = input.nextInt();

		       
		    

		   

		        switch (month) {
		        case 1:
		        case 2:
		        case 3:
		        case 7:
		        case 8:
		        case 9:
		        case 10:
		        	System.out.println(rent*days);
		        	break;
		        
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		            	System.out.println((rent+(rent*0.2))*days);
		               
		                break;
		                default:
		                	System.out.println("invalid month no:");
		        }

		       
		    }
		


	}