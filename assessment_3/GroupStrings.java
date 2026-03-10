package com.techouts.assessment_3;
//Write a Java program to group a list of strings by their first character using Map.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStrings {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Avocado");
        words.add("Blueberry");
        words.add("Cherry");

        // Map to store groups
        Map<Character, List<String>> groupedMap = new HashMap<>();

        // Group strings by their first character
        for (String word : words) {
            if (word == null || word.isEmpty()) continue; // skip null or empty
            char firstChar = word.charAt(0);
            if (!groupedMap.containsKey(firstChar)) {
                groupedMap.put(firstChar, new ArrayList<String>());
            }
            groupedMap.get(firstChar).add(word);
        }

        // Print the grouped map
        for (Map.Entry<Character, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}