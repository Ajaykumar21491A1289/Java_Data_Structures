package LinkedListDemo1;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);

        // Print the list
        System.out.println("List: " + list);

        // Insert at a specific position
        list.add(2, 5);
        System.out.println("After adding 5 at index 2: " + list);

        // Remove elements
        list.removeLast();
        System.out.println("After removing the last element: " + list);

        list.removeFirst();
        System.out.println("After removing the first element: " + list);

        // Access elements
        Integer elementAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Search for an element
        boolean containsFive = list.contains(5);
        System.out.println("Contains 5: " + containsFive);

        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
