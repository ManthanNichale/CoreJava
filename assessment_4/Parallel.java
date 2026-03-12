package com.techouts.assessment_4;
//Write a program using parallel streams to process a large collection and explain the risks of using it with shared mutable data.
import java.util.*;
import java.util.stream.*;

public class Parallel {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Parallel stream to print squares
        numbers.parallelStream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}