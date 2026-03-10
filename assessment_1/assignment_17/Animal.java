package com.techouts.assessment_1.assignment_17;

abstract class Animal {
    // Abstract method (must be implemented by subclass)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
