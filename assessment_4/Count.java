package com.techouts.assessment_4;
//Write a program to count the number of elements in a list that satisfy a given condition using streams.
import java.util.*;
import java.util.stream.*;

public class Count {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7, 15,90);

        // Count numbers greater than 10
        long count = numbers.stream().filter(i -> i > 10) .count();

        System.out.println("count of condition " + count);
    }
}


