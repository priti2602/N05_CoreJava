package org.tnsif.challenges;
/* 
 * Q.2a microwave oven manufacturer recommends that when heating two items,and 50%
 to the heating time and when heating 3 items double the heating time.Heating more 
 than 3 items at once is not recommended.Write a program to find out the recommended 
 heating time.
 Item=2,heating time=5.0
 * 
 */

import java.util.Scanner;
public class Heating {
	
	
	
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of items to heat: ");
	        int items = input.nextInt();

	        System.out.print("Enter the initial heating time: ");
	        double initialHeatingTime = input.nextDouble();

	        double recommendedHeatingTime = calculateRecommendedHeatingTime(items, initialHeatingTime);
	        System.out.println("Recommended heating time: " + recommendedHeatingTime + " minutes");
	    }

	    public static double calculateRecommendedHeatingTime(int items, double initialHeatingTime) {
	        double recommendedTime = initialHeatingTime;

	        switch (items) {
	            case 2:
	                recommendedTime *= 1.5; // 50% increase for 2 items
	                break;
	            case 3:
	                recommendedTime *= 2;   // Double the time for 3 items
	                break;
	            default:
	                System.out.println("Heating more than 3 items at once is not recommended.");
	        }

	        return recommendedTime;
	    }
	


	}