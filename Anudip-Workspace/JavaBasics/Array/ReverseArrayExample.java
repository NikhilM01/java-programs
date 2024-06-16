package Array;

public class ReverseArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original array:");
        displayArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        // Display the reversed array
        System.out.println("\nReversed array:");
        displayArray(numbers);
    }

    // Method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Method to display the array elements
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
