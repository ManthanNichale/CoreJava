package com.techouts.assessment_3;
//Write a Java program to find the difference between two Lists.
import java.util.ArrayList;
import java.util.List;

public class ListDifference {
    public static void main(String[] args) {
        // create first list
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // create second list
        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Apple");

        // find difference (elements in list1 not in list2)
        List<String> difference = new ArrayList<>(list1);
        difference.removeAll(list2);

        List<String> difference1 = new ArrayList<>(list2);
        difference1.removeAll(list1);

        // print the difference
        System.out.println("Difference of the two list1: " + difference);
        System.out.println("Difference of the two lists2: " + difference1);


    }
}