package Array;

public class SecondMaxMinArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 2, 8, 1, 6, 3, 7, 4};

        // Find and display the second maximum and second minimum values
        int secondMax = findSecondMax(numbers);
        int secondMin = findSecondMin(numbers);

        System.out.println("Second Maximum value: " + secondMax);
        System.out.println("Second Minimum value: " + secondMin);
    }

    // Method to find the second maximum value in an array
    private static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    // Method to find the second minimum value in an array
    private static int findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }

        return secondMin;
    }
}
