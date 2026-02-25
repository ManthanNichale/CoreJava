package com.techouts.cj4;
import java.util.Scanner;

class Constructors {

    int age;
    String name;
    int salary;
    String place;

    static String profession = "office";

    Constructors(String eplace, int eage, String ename, int esalary) {
        age = eage;
        name = ename;
        salary = esalary;
        place = eplace;
    }

    public static void main(String[] args) {



                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Place:");
                String ePlace = sc.nextLine();

                System.out.println("Enter Age:");
                int eage = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Name:");
                String ename = sc.nextLine();

                System.out.println("Enter Salary:");
                int esalary = sc.nextInt();

                Constructors refe = new Constructors(ePlace, eage, ename, esalary);


                System.out.println("\nEmployee Details: =" + profession);
                System.out.println("Place: " + refe.place);
                System.out.println("Age: " + refe.age);
                System.out.println("Name: " + refe.name);
                System.out.println("Salary: " + refe.salary);


                sc.close();


    }
}