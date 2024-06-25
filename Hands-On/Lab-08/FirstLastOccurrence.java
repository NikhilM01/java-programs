package CollectionLab;

import java.util.LinkedList;

 class FirstLastOccurrence {
    public static void main(String[] args) {

        // Createation a LinkedList and adding elements to it
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(5);

        // first occurrence of the element 5
        int firstOccurrence = linkedList.indexOf(5);

        // last occurrence of the element 3
        int lastOccurrence = linkedList.lastIndexOf(5);

        // Print the first and last occurrence of the element 5
        System.out.println("First occurrence of 5: " + firstOccurrence);
        System.out.println("Last occurrence of 5: " + lastOccurrence);
    }
}
