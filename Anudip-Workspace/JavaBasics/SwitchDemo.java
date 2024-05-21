package JavaBasics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a number between 1 and 5:");
	        int number = scanner.nextInt();
	        
	        switch (number) {
	            case 1:
	                System.out.println("You entered one.");
	                break;
	            case 2:
	                System.out.println("You entered Two.");
	                break;
	            case 3:
	                System.out.println("You entered three.");
	                break;
	            case 4:
	                System.out.println("You entered four.");
	                break;
	            case 5:
	                System.out.println("You entered five.");
	                break;
	            default:
	                System.out.println("Invalid input");
	                break;
	        }

	}

}
