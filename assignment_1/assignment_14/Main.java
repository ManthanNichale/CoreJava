package com.techouts.assignment_1.assignment_14;

public class Main {
    public static void main(String[] args) {

        // Creating Professor object separately
        Professor p1 = new Professor("Dr. John", "Computer Science");

        // Passing Professor object to Department
        Department d1 = new Department("IT Department", p1);

        d1.displayDepartment();
    }
}
