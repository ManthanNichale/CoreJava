package com.techouts.assessment_4;
// Write a program to demonstrate lazy evaluation in Java 8 streams using filter() and map().
import java.util.*;
import java.util.stream.*;

public class Envaluation {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Lazy evaluation demonstration
        numbers.stream().filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("Mapping: " + n);
                    return n * n;
                })
                .forEach(n -> System.out.println("Result: " + n));
    }
}