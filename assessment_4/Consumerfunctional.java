package com.techouts.assessment_4;
//Write a program using Predicate, Function, and Consumer functional interfaces together.
import java.util.*;
import java.util.function.*;

public class Consumerfunctional {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7);

        // predicate: test if number > 10
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        // function: square the number
        Function<Integer, Integer> square = n -> n * n;

        // consumer: print the number
        Consumer<Integer> print = n -> System.out.println(n);

        // processing
        numbers.stream()
                .filter(isGreaterThan10)       // predicate
                .map(square)                    // function
                .forEach(print);                // consumer
    }
}