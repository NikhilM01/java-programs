//Write a Java program to sum values of an array.

package com.nikhil.array;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user (Dry run: User enters 3)
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[size];

        // Get the elements of the array from the user  (Dry run: Example input 1, 2, 3)
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Initialize a variable to store the sum
        int sum = 0;

        // Calculate the sum of the array elements (Dry run: Traverse the array [1, 2, 3])
        for (int element : arr) {
            sum += element;  // Add each element to the sum

            // Dry run: After each iteration
            //  Iteration 1: sum = 0 + 1 = 1
            //  Iteration 2: sum = 1 + 2 = 3
            //  Iteration 3: sum = 3 + 3 = 6 (final sum)
        }

        // Print the sum of the array
        System.out.println("The sum of the array elements is: " + sum);
    }
}
