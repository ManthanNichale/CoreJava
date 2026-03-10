package com.techouts.assessment_1.assignment_7;

public class M {
    static int count = 0;

    String name;

    M(String name) {
        this.name = name;
        count++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    // Instance method
    void displayInfo() {
        System.out.println("Object name: " + name);
        System.out.println("Accessing static count " + count);
    }

    public static void main(String[] args) {
        M.displayCount();

        M obj1 = new M("A 1");
        M obj2 = new M("B 2");

        obj1.displayInfo();
        obj2.displayInfo();

        M.displayCount();

        System.out.println("Accessing static count via obj1: " + obj1.count);
    }
}