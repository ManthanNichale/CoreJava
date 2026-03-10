package com.techouts.cj7.collection.hashtable;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {

        // Creating Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding elements
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Mango");
        table.put(4, "Orange");

        // Displaying elements
        System.out.println("Hashtable elements: " + table);

        // Access element
        System.out.println("Value at key 2: " + table.get(2));

        // Removing element
        table.remove(3);

        // Display after removal
        System.out.println("After removing key 3: " + table);
    }
}