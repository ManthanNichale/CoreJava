package com.techouts.assignment_3;
//Write a Java program to check if two Lists contain the same elements.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareLists {
    public static void main(String[] args) {
        // Create first list
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Create second list
        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Orange");
        list2.add("Apple");

        // Sort both lists
        Collections.sort(list1);
        Collections.sort(list2);

        // Check if lists are equal
        if (list1.equals(list2)) {
            System.out.println("Both lists contain the same elements.");
        } else {
            System.out.println("Lists do not contain the same elements.");
        }
    }
}