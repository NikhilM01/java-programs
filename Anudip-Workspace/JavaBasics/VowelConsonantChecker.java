package JavaBasics;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 

        
        if (Character.isLetter(ch)) {
            // Convert the character to lowercase for easy comparison
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel or a consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet character.");
        }

        scanner.close();
    }
}
