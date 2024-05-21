package Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,5,1};


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Sum of array at index " +i+  " : " +(arr1[i] + arr2[i]) );
        }

    }


}
