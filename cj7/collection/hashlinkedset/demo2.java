package com.techouts.cj7.collection.hashlinkedset;
import java.util.LinkedHashSet;

public class demo2 {


        public static void main(String[] args) {

            // Create a LinkedHashSet of integers
            LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

            // Manually add numbers
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(20);  // duplicate, will be ignored
            numbers.add(40);
            numbers.add(10);  // duplicate, ignored

            // Print all numbers (in insertion order)
            System.out.println("LinkedHashSet elements:");
            for (Integer num : numbers) {
                System.out.println(num);
            }
        }
    }

