package com.techouts.assignment_3;
//Write a Java program to convert a Set into a List.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetToList {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        System.out.println("Original Set: " + set);

        // Convert Set to List
        List<String> list = new ArrayList<>(set);

        System.out.println("Converted List: " + list);
    }
}