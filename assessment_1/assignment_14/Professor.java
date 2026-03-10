package com.techouts.assessment_1.assignment_14;

public class Professor {
    String name;
    String subject;

    Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayProfessor() {
        System.out.println("Professor Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

