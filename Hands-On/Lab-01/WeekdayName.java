import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();


        if (dayNumber >= 1 && dayNumber <= 7) {

            String weekdayName;
            switch (dayNumber) {
                case 1:
                    weekdayName = "Sunday";
                    break;
                case 2:
                    weekdayName = "Monday";
                    break;
                case 3:
                    weekdayName = "Tuesday";
                    break;
                case 4:
                    weekdayName = "Wednesday";
                    break;
                case 5:
                    weekdayName = "Thursday";
                    break;
                case 6:
                    weekdayName = "Friday";
                    break;
                case 7:
                    weekdayName = "Saturday";
                    break;
                default:
                    weekdayName = "Invalid";
                    break;
            }


            System.out.println("The weekday corresponding to the number " + dayNumber + " is: " + weekdayName);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
