package com.techouts.assessment_1.assignment_19;

public class Main {
    public static void main(String[] args) {
        // Using abstract class
        Animal a = new Dog();
        a.sound();   // Overridden abstract method
        a.sleep();   // Non-abstract method

        // Using interface
        Vehicle v = new Car();
        v.start();   // Implemented interface method
    }
}
