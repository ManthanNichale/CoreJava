package com.techouts.assessment_4;
//Write a program demonstrating how Optional.map() and Optional.flatMap() work.
import java.util.*;

public class Demonstrating {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Alice");

        // map(): transforms the value
        Optional<Integer> length = name.map(String::length);
        System.out.println("Using map(): " + length);  // Optional[5]

        // flatMap(): function returns Optional, flattens it
        Optional<String> upper = name.flatMap(n -> Optional.of(n.toUpperCase()));
        System.out.println("Using flatMap(): " + upper); // Optional[ALICE]
    }
}