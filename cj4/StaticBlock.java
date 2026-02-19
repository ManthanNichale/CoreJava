package cj4;

public class StaticBlock {
    static {
        System.out.println("First Exicute it static block");//it excute the without calling it
    }

    // Static Variables
    static String collegeName;
    static String city;
    static int totalStudents;

    // First Static Block
    static {
        System.out.println("Static Block 1 Executed");
        collegeName = "MIT College";
        city = "India";
        totalStudents = 0;
    }

    // Second Static Block
    static {
        System.out.println("Static Block 2 Executed");
        System.out.println("College Name: " + collegeName);
        System.out.println("City: " + city);
        System.out.println("-----------------------------");
    }


    public StaticBlock(String john) {
    }

    // Static Method
    static void displayCollegeInfo() {
        System.out.println("College Information:");
        System.out.println("Name: " + collegeName);
        System.out.println("City: " + city);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("-----------------------------");
    }

    // Main Method


    public static void main(String[] args) {
        System.out.println("Second Exicute it main method");

            System.out.println("Main Method Started");
            System.out.println("-----------------------------");

            displayCollegeInfo();

        StaticBlock s1 = new StaticBlock("raj");
        StaticBlock s2 = new StaticBlock("Mohit");
        StaticBlock s3 = new StaticBlock("Man");

            displayCollegeInfo();

            System.out.println("Main Method Ended");
        }
    }

