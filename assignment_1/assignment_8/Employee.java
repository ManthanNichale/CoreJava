package com.techouts.assignment_1.assignment_8;

class Employee extends Person {

    Employee(String name) {
        super(name); // Call parent constructor
    }

    void Employ_name(String newName) {
        name = newName; // Change the name inherited from parent
        System.out.println("Name changed to: " + name);
    }
}

