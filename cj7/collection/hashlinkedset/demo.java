package com.techouts.cj7.collection.hashlinkedset;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class demo {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of elements:");
            int n = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            LinkedHashSet<String> set = new LinkedHashSet<>();

            System.out.println("Enter strings:");

            // Collect strings from user
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                set.add(s);  // duplicates will be ignored automatically
            }

            // Print elements (in insertion order)
            System.out.println("LinkedHashSet elements:");
            for (String s : set) {
                System.out.println(s);
            }

            sc.close();
        }
    }

