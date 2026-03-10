package com.techouts.assessment_1.assignment_17;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Abstract class reference
        a.sound();
        a.sleep();            // Calls non-abstract method
    }
}
