//Write a Java program to copy an array by iterating the array.

package com.nikhil.array;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user (Dry run: Assume user enters 4)
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the original array
        int[] originalArr = new int[size];

        // Get the elements of the original array from the user (Dry run: Example input 10, 20, 30, 40)
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArr[i] = scanner.nextInt();
        }

        // Declare and initialize the copied array with the same size
        int[] copiedArr = new int[size];

        // Copy elements from original array to copied array (Dry run: Traverse originalArr)
        System.out.println("Copying elements...");
        for (int i = 0; i < size; i++) {
            copiedArr[i] = originalArr[i];  // Copy element at each index

            // Dry run: After each iteration
            // - Iteration 1: copiedArr[0] = originalArr[0] (copiedArr becomes [10])
            // - Iteration 2: copiedArr[1] = originalArr[1] (copiedArr becomes [10, 20])
            // - Iteration 3: copiedArr[2] = originalArr[2] (copiedArr becomes [10, 20, 30])
            // - Iteration 4: copiedArr[3] = originalArr[3] (copiedArr becomes [10, 20, 30, 40])
        }

        // Print the original array
        System.out.println("Original array:");
        for (int element : originalArr) {
            System.out.print(element + " ");
        }

        System.out.println(); // Add a newline for better formatting

        // Print the copied array
        System.out.println("Copied array:");
        for (int element : copiedArr) {
            System.out.print(element + " ");
        }
    }
}

