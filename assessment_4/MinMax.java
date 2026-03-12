package com.techouts.assessment_4;
//Write a program to find the maximum and minimum values from a list using Java 8 streams.
import java.util.*;
import java.util.stream.*;
public class MinMax {

     public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(345, 612, 78, 20, 17, 15);

            //max
            int max = numbers.stream()
                    .max(Integer::compare)
                    .get();

            //min
            int min = numbers.stream()
                    .min(Integer::compare)
                     .get();

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }


