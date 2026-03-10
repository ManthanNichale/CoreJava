package com.techouts.assignment_3;
//Write a Java program to implement a phone directory using HashMap.
import java.util.HashMap;

public class Phonedirectory {
    public static void main(String[] args) {
        // Create a simple phone directory
        HashMap<String, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Alice", "1233454567890");
        phoneDirectory.put("Bob", "234056798901");
        phoneDirectory.put("Charlie", "345967889012");

        // Print all entries
        for (String name : phoneDirectory.keySet()) {
            System.out.println(name + " : " + phoneDirectory.get(name));
        }
    }
}
