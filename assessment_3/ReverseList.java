package com.techouts.assessment_3;
//Write a Java program to reverse elements of a List using Collections utility
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Original List: " + list);

        // reverse the list using Collections
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}