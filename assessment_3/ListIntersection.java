package com.techouts.assessment_3;
//Write a Java program to find the intersection of two Lists.
import java.util.ArrayList;
import java.util.List;

public class ListIntersection {
    public static void main(String[] args) {
        // Create first list
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // create second list
        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Apple");

        // find intersection
        List<String> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        // print the intersection
        System.out.println("Intersection of the two lists: " + intersection);
    }
}