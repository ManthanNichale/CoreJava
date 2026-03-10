package com.techouts.assessment_3;
//Write a Java program to convert a List into a Set to remove duplicates.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertList {
    public static void main(String[] args) {
        // Create a List with duplicate elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println("Original List: " + list);

        // Convert List to Set to remove duplicates
        Set<String> set = new HashSet<>(list);

        List<String> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}