import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display the operations menu
        System.out.println("Choose an operation:");
        System.out.println("a. Addition");
        System.out.println("b. Subtraction");
        System.out.println("c. Multiplication");
        System.out.println("d. Division");


        System.out.print("Enter your choice (a/b/c/d): ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.println("Result: " + (num1 + num2));
                break;
            case 'b':
                System.out.println("Result: " + (num1 - num2));
                break;
            case 'c':
                System.out.println("Result: " + (num1 * num2));
                break;
            case 'd':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
                break;
        }

    }
}
