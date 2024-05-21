import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();



        if (month >= 1 && month <= 12) {

            int daysInMonth;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        daysInMonth = 29; // Leap year
                    } else {
                        daysInMonth = 28; // Non-leap year
                    }
                    break;
                default:
                    daysInMonth = -1;
                    break;
            }


            if (daysInMonth != -1) {
                System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);
            } else {
                System.out.println("Invalid month!");
            }
        } else {
            System.out.println("Invalid month! Please enter a month between 1 and 12.");
        }
    }
}
