package com.techouts.assessment_4;
//. Write a Java 8 program to filter duplicate elements from a list using the Stream API.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterduplicate {

    public static void main(String []args) {
        List<Integer> numbers = Arrays.asList(144, 32, 378, 120, 144, 378, 50, 1);

        // removing duplicate
        List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("removing the  Duplicate: " + list);

    }
}
