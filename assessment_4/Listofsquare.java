package com.techouts.assessment_4;
//Write a program to convert a list of integers into a list of their squares using map()
import java.util.*;
import java.util.stream.*;

public class Listofsquare {

        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(11, 62, 31, 54, 15);

            // Using map  get squares
            List<Integer> squar = numbers.stream().map(j -> j * j).collect(Collectors.toList());

            System.out.println("Squares List: " + squar);

    }

}
