import java.util.Scanner;

public class CubesUpToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Cubes of numbers from 1 to " + n + ":");


            for (int i = 1; i <= n; i++) {
                int cube = i * i * i;
                System.out.println(i + "^3 = " + cube);
            }
        } else {
            System.out.println("Please enter a positive integer value.");
        }
    }
}
