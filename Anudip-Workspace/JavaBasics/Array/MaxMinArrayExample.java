package Array;

public class MaxMinArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 2, 8, 1, 6, 3, 7, 4};

        // Find and display the maximum and minimum values
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Method to find the maximum value in an array
    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Method to find the minimum value in an array
    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
