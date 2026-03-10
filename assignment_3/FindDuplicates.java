package com.techouts.assignment_3;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Sample ArrayList with duplicate elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>();
        // HashSet to store duplicates
        HashSet<String> duplicates = new HashSet<>();

        // Iterate through the ArrayList
        for (String element : list) {
            if (!uniqueElements.add(element)) {
                // if element is already in uniqueElements, it a duplicate
                duplicates.add(element);
            }

        }
        System.out.println("Duplicate elements are: " + duplicates);


    }
}