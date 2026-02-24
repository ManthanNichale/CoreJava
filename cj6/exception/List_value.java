package com.techouts.cj6.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class List_value {

    void List() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                int value = sc.nextInt();  // take integer input
                list.add(value);           // add to ArrayList
            }
            System.out.println("Values in list: " + list);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers!");
        }
        finally {
            System.out.println("Program ended.");
        }
    }

    public static void main(String[] args) {
        List_value obj = new List_value();
        obj.List();
    }
}