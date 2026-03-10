package com.techouts.assignment_3;
//Write a Java program to find the maximum and minimum element in a List.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minmax {
    public static void main(String[] args) {
        // Create a list
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(10);
        list.add(45);
        list.add(5);
        list.add(30);

        // Find maximum and minimum elements
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("List: " + list);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}