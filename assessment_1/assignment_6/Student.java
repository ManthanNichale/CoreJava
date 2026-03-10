package com.techouts.assessment_1.assignment_6;

public class Student {
    String name;
    int age;

    Student(){
        name="Raj";
        age=20;
        //System.out.println("defult constructor");
    }
    Student(String Name,int Age){
        name=Name;
        age=Age;
        System.out.println("parameterize constructor");
    }
    void Nonparameter(){
        System.out.println("Parameter");
        System.out.println(age);
        System.out.println(name);
    }
    void Parameter(){

        System.out.println("Non-Parameterize");
        System.out.println(age);
        System.out.println(name);
    }

    static void main() {
        Student P=new Student("Mohit",29);
        P.Nonparameter();
        Student N=new Student();
        N.Parameter();
    }
}
