import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Ask the user to enter an index
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        // Check if the index is within the bounds of the string
        if (index >= 0 && index < inputString.length()) {
            // Get the character at the specified index
            char charAtIndex = inputString.charAt(index);

            System.out.println("The character at index " + index + " is: " + charAtIndex);
        } else {
            // Print an error message if the index is out of bounds
            System.out.println("Error: Index is out of bounds.");
        }

        scanner.close();
    }
}

/*
OUTPUT :
Enter a string: Nikhil
Enter an index: 3
The character at index 3 is: h
 */