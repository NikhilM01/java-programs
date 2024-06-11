import java.util.Scanner;

public class StringContainsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Ask the user to enter the sequence of characters to be checked
        System.out.print("Enter the sequence of characters to check: ");
        String sequence = scanner.nextLine();

        // Check if the main string contains the specified sequence
        boolean containsSequence = mainString.contains(sequence);

        // Print the result
        if (containsSequence) {
            System.out.println("The main string contains the specified sequence of characters.");
        } else {
            System.out.println("The main string does not contain the specified sequence of characters.");
        }

        scanner.close();
    }
}

/*
OUTPUT :
Enter the main string: Hello, World!
Enter the sequence of characters to check: World
The main string contains the specified sequence of characters.

 */