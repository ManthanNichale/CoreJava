package com.techouts.assessment_1.assignment_14;

public class Department {
    String deptName;
    Professor professor;   // Department HAS-A Professor (Aggregation)

    Department(String deptName, Professor professor) {
        this.deptName = deptName;
        this.professor = professor;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        professor.displayProfessor();
    }
}

