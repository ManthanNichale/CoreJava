package com.techouts.assessment_1.assignment_11.polymorphism;

public class Calculator {
    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

