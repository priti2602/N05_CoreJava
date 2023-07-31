/*1.  Write a program to calculate the hotel tariff .The room rent is 12% high during peek
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
		        double rent = input.nextDouble();

		        System.out.print("Enter the number of days of stay: ");
		        int days = input.nextInt();

		        double totalCost = calculateHotelTariff(month, rent, days);
		        System.out.println("The total hotel tariff is: " + totalCost);
		    }

		    public static double calculateHotelTariff(int month, double rent, int days) {
		        boolean isPeakSeason = false;

		        switch (month) {
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		                isPeakSeason = true;
		                break;
		        }

		        if (isPeakSeason) {
		            rent *= 1.12; // 12% increase during peak season
		        }

		        return rent * days;
		    }
		


	}