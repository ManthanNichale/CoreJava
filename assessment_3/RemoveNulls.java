package com.techouts.assessment_3;
//Write a Java program to remove all null elements from a List.

import java.util.ArrayList;
import java.util.List;
public class RemoveNulls{
    public static void main(String[] args) {
        // Create a list with null elements
        List<String> list = new ArrayList<>();
        list.add("App");
        list.add(null);
        list.add("Mobile");
        list.add(null);
        list.add("Readmi");

        System.out.println("Original List: " + list);

        // Remove null elements using a for loop (iterate backwards)
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == null) {
                list.remove(i);
            }
        }

        System.out.println("List after removing nulls: " + list);
    }
}