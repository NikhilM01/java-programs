package CollectionLab;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // creation and addition of data in ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2);

        // Print the ArrayList before sorting
        System.out.println("Before sorting: " + arrayList);

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Print the ArrayList after sorting
        System.out.println("After sorting: " + arrayList);
    }
}

