package com.techouts.assessment_3;
//Write a Java program to merge two ArrayLists into a single list without duplicates.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeArrayLists {
    public static void main(String[] args) {
        // Create first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Create second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Apple");

        // Merge lists using a Set to remove duplicates
        Set<String> mergedSet = new HashSet<>(list1);
        mergedSet.addAll(list2);

        // Convert back to a List if needed
        List<String> mergedList = new ArrayList<>(mergedSet);

        // Print the merged list
        System.out.println("Merged ArrayList without duplicates: " + mergedList);
    }
}