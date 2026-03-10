package com.techouts.assessment_1.assignment_9.multi_inheritance;

public class Test {
    public static void main(String[] args) {
        Bike b = new Bike();

       // b.start();  // From Vehicle
        b.drive();  // From Car
        b.ride();   // From Bike
    }
}
