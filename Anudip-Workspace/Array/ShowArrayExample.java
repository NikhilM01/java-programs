package Array;

public class ShowArrayExample {
    public static void main(String[] args) {
        int[] numbers= {21,11,111,23};


        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
