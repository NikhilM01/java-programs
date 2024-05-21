import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();



        if (n > 0) {
            int sum = 0;
            int count = 0;
            int number = 1;


            while (count < n) {
                sum += number;
                number += 2;
                count++;
            }


            System.out.println("Sum of first " + n + " odd natural numbers: " + sum);
        } else {
            System.out.println("Please enter a positive integer value for n.");
        }
    }
}
