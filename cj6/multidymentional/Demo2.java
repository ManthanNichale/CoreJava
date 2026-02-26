package com.techouts.cj6.multidymentional;

import java.util.Scanner;

public class Demo2 {

    void Arrays() {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        System.out.print("Enter  elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();   // taking input
            }
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Demo2 ref = new Demo2();
        ref.Arrays();
    }
}