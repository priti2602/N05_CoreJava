
/* 
 * Q.2a microwave oven manufacturer recommends that when heating two items,
and 50% to the heating time and when heating 3 items double the heating time.Heating more 
 than 3 items at once is not recommended.Write a program to find out the recommended 
 heating time.
 Item=2,heating time=5.0
 * 
 */
package org.tnsif.challenges;
import java.util.Scanner;
public class Heating {
	
		public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);

	        System.out.print("Enter the number of items to heat: ");
	        int items = s.nextInt();

	        System.out.print("Enter the initial heating time: ");
	        float ht = s.nextFloat();

	       
	   	        switch (items) {
	            case 1:
	                System.out.println(ht);
	                break;
	            case 2:
	                System.out.println((ht/2)+ht);
	                break;
	            case 3:
	            	System.out.println(2*ht);
	            default:
	                System.out.println("Heating more than 3 items at once is not recommended.");
	        }

	       
	    }
	


	}