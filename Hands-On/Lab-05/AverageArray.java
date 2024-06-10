//Write a Java program to calculate the average value of array elements.
package com.nikhil.array;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user (Dry run: Assume user enters 3)
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[size];

        // Get the elements of the array from the user (Dry run: Example input 1, 2, 3)
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }

        // Calculate the average (avoiding division by zero)
        double average;
        if (size > 0) {
            average = (double) sum / size; // Cast sum to double for accurate division
        } else {
            average = 0; // Handle empty array case
        }

        // Print the average of the array
        System.out.println("The average of the array elements is: " + average);

        // Dry run explanation
        System.out.println("\n** Dry run for array [1, 2, 3] (size 3):**");
        System.out.println(" - Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("   Element " + (i + 1) + ": " + arr[i]);
        }
        System.out.println(" - Sum calculation:");
        int tempSum = 0;
        for (int element : arr) {
            tempSum += element;
            System.out.println("   Adding " + element + ", sum becomes: " + tempSum);
        }
        System.out.println(" - Average calculation (since size > 0):");
        System.out.println("   Average = " + sum + " (double) / " + size + " = " + average);
    }
}

