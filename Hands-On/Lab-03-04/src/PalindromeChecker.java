import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reverseNumber = 0;       // Variable to store the reversed number

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;          // Extract the last digit
            reverseNumber = reverseNumber * 10 + digit; // Build the reversed number
            number /= 10;                     // Remove the last digit from the original number
        }


        return originalNumber == reverseNumber;
    }
}
