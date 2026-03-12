package com.techouts.assessment_4;
//Write a program to find the average of a list of numbers using Collectors.averagingDouble()
import java.util.*;
import java.util.stream.*;

public class Average {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7, 15);

        Double  average = numbers.stream().collect(Collectors.averagingDouble(n -> n));

        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
    }
}