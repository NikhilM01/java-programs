package ExceptionHandling;


public class TryCatchBlock {

                             // Method to perform division and throw an exception
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0; // This will cause an exception

        try {
            divide(a, b);
        } catch (ArithmeticException e) {
          e.printStackTrace();
        }

        System.out.println("Program continues after the exception.");
    }
}
