package com.techouts.assessment_4;
//Write a program to check whether all elements in a list satisfy a condition using allMatch().
import java.util.*;
import java.util.stream.*;

public class Allmatch {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 20, 14, 18);

        // Check if all numbers are greater than 10
        boolean allGreaterThan10 = numbers.stream().allMatch(n -> n > 10);

        System.out.println("All numbers match " + allGreaterThan10);
    }
}