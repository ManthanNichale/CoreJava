package com.techouts.assignment_3;
//Write a Java program to iterate through a HashMap and print keys and values
import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Apple", 10);
        list.put("Banana", 20);
        list.put("Orange", 15);
        list.put("Mango",21);

        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}