package com.techouts.assignment_1.assignment_19;

abstract class Animal {
    abstract void sound();   // Abstract method

    void sleep() {           // Non-abstract method allowed
        System.out.println("Animal is sleeping");
    }
}
