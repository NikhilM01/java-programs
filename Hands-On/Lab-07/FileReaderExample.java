package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    // Method to read a file and throw an exception if the file is not found
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and print the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        String fileName = "example.txt"; // Change this to the path of the file you want to read

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after the exception handling.");
    }
}
