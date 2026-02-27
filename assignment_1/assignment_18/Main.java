package com.techouts.assignment_1.assignment_18;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();  // Calls Car's start()
        v2.start();  // Calls Bike's start()
    }
}

