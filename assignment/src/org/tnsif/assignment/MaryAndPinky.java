package org.tnsif.assignment;

import java.util.Scanner;

public class MaryAndPinky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        
        System.out.println("Numbers said by Pinky");
        int[] pinkyNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers said by Mary");
        int[] maryNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            maryNumbers[i] = scanner.nextInt();
        }

        boolean isReverseOrder = true;
        for (int i = 0; i < n; i++) {
            if (maryNumbers[i] != pinkyNumbers[n - 1 - i]) {
                isReverseOrder = false;
                break;
            }
        }

        
        if (isReverseOrder) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }
    }
}
