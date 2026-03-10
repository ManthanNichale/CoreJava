package com.techouts.assessment_1.assignment_13;

public class Teacher {
        String name;

        Teacher(String name) {
            this.name = name;
        }

        void displayTeacher(Student s) {   // Association with Student class
            System.out.println("Teacher Name: " + name);
            s.displayStudent();
        }
    }

