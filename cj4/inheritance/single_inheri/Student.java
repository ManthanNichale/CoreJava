package com.techouts.cj4.inheritance.single_inheri;
class Student extends Person {

    int rollNo;
    String course;

    // Child Constructor
    Student(String name, int age, String country, int rollNo, String course) {
        super(name, age, country);  // Calling Parent Constructor
        this.rollNo = rollNo;
        this.course = course;


    }

    void displayStudent() {
        displayPerson();
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("--------------------------------");
    }
}