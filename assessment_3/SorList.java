package com.techouts.assessment_3;
//Write a Java program to sort a List of integers in ascending and descending order.

import java.util.ArrayList;
import java.util.Collections;

public class SorList {


    public static void main(String []args) {


            ArrayList<Integer> numbers = new ArrayList<>();

            // Add elements to the list
            numbers.add(2);
            numbers.add(4);
            numbers.add(8);
            numbers.add(16);
            numbers.add(32);
            numbers.add(64);
            numbers.add(128);

        // Sort in Ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order"+" "+numbers);

        //Sort in  Descending order
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Descending"+" "+numbers);



    }
}
