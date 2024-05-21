import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;
            System.out.print("First " + n + " natural numbers: ");


            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }


            System.out.println("\nSum of first " + n + " natural numbers: " + sum);
        } else {
            System.out.println("Please enter a positive integer value for n.");
        }
    }
}
