package com.techouts.assignment_1.assignment_11.polymorphism;

public class Test {
    public static void main(String[] args) {

        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
        System.out.println("-----------------------");
        // Runtime Polymorphism
        Animal obj = new Dog();
        obj.sound();
    }
}
