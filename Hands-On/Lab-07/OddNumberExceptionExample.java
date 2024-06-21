

import java.util.Scanner;

public class OddNumberExceptionExample {

    // Method to check if a number is odd and throw an exception if it is
    public static void checkIfOdd(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number is odd.");
        }
        System.out.println("The number is even.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");       //input from user
        int userInput = scanner.nextInt();

        try {
            checkIfOdd(userInput);
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after the exception handling.");
    }
}

/*
 * OUTPUT:
 * Enter a number: 22
The number is even.
Program continues after the exception handling.
 */
