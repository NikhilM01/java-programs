package JavaBasics;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("Sum of the numbers: " + sum);
        double avg = (double) sum / n;
        
        System.out.println("Avg of the numbers: " + avg);
    }
}