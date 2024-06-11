import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Ask the user to enter the second string (character sequence) to compare
        System.out.print("Enter the second string to compare: ");
        String secondString = scanner.nextLine();

        // Compare the two strings using the equals() method
        boolean areEqual = firstString.equals(secondString);

        // Print the result of the comparison
        if (areEqual) {
            System.out.println("The first string is equal to the second string.");
        } else {
            System.out.println("The first string is not equal to the second string.");
        }

        scanner.close();
    }
}

//    Enter the first string: Hello
//    Enter the second string to compare: Hello
//    The first string is equal to the second string.
