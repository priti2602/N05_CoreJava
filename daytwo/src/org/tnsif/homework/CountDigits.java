package org.tnsif.homework;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int digitCount = 0;

        do {
           
            digitCount++;
            
            num /= 10;
        } while (num > 0);

        System.out.println("Number of digits: " + digitCount);
    }
}
