package com.techouts.cj7.collection.treeset;
import java.util.Scanner;
import java.util.TreeSet;
public class Exmple1 {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of elements:");
            int n = sc.nextInt();

            TreeSet<Integer> list = new TreeSet<>();

            System.out.println("Enter integers:");

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                list.add(num);  // duplicates ignored automatically
            }

            // Print elements in ascending order
            System.out.println("TreeSet elements sorted ");
            for (Integer num : list) {
                System.out.print(" "+num);
            }

            sc.close();
        }
    }

