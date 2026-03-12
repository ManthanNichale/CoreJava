package com.techouts.assessment_4.lambda_expression;

import java.util.ArrayList;

public class Test {

    public static void main(String args[]) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(23, "Manthan"));
        list.add(new Student(24, "Raj"));

        // Lambda sorting by age
        list.sort((a, b) -> a.age - b.age);

        for(Student s : list){
            System.out.println(s.name + " " + s.age);}
    }
    }

