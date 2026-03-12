package com.techouts.assessment_4.implementto_interface;
//Write a program to demonstrate default methods conflict when a class implements two interfaces. small program
public interface A {
    default void show() {
        System.out.println("Interface A");
    }
}
