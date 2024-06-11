import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Ask the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the second string to the end of the first string
        String concatenatedString = firstString + secondString;

        // Print the concatenated string
        System.out.println("The concatenated string is: " + concatenatedString);

        scanner.close();
    }
}

/*
OUTPUT :
Enter the first string: Hello
Enter the second string: World
The concatenated string is: HelloWorld
 */
