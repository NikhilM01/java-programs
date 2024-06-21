package ExceptionHandling;

public class ExceptionVovel {

    // Method to check if a string contains any vowels
    public static void checkForVowels(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("The input string is empty or null.");
        }


        String vowels = "AEIOUaeiou";      // Regular expression to match vowels


        for (char c : input.toCharArray()) {          // Check each character in the string to see if it's a vowel
            if (vowels.indexOf(c) != -1) {
                System.out.println("The string contains vowel.");
                return;
            }
        }


        throw new Exception("The string does not contain any vowels.");       // If no vowels are found, throw an exception
    }

    public static void main(String[] args) {
        String testString = "nkt Bdh";      //Input

        try {
            checkForVowels(testString);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}


/*
 * OUTPUT:
 * java.lang.Exception: The string does not contain any vowels.
        at ExceptionHandling.ExceptionVovel.checkForVowels(ExceptionVovel.java:23)
        at ExceptionHandling.ExceptionVovel.main(ExceptionVovel.java:30)
 */