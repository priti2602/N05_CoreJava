package org.tnsif.polymorphism;
import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Length of the array
            int[] arr = new int[N];

            // Read the array elements
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Calculate the sum of all elements in the array
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            // Calculate the result array
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = totalSum - arr[i];
            }

            // Output the result array
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

