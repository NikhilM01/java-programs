package CollectionLab;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {

        // Create a HashSet and add elements to it
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");

        // using of iteratior to iterate
        Iterator<String> iterator = hashSet.iterator();

        // Iterate the HashSet
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

