package com.techouts.cj5.thisKeyword.superkeyword;

class Student extends Person {
    String name = "Raj";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}