package CollectionLab;
import java.util.TreeSet;
import java.util.Iterator;

 class NumbersLess {
    public static void main(String[] args) {

        // Create a TreeSet and add elements to it
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(9);

        // Create a new TreeSet to store numbers less than 7
        TreeSet<Integer> lessThanSeven = new TreeSet<>();

        // Iterate
        for (Integer number : treeSet) {
            if (number < 7) {
                lessThanSeven.add(number);
            }
        }

        // Print the elements
        System.out.println("Numbers less than 7: " + lessThanSeven);
    }
}

