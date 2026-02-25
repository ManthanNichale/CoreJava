package com.techouts.cj6.Array;

import java.util.Scanner;

public class ArrayInputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();   // taking input
        }

        System.out.println("You entered:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }


    }
}