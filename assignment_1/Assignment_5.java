package com.techouts.assignment_1;

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to reverse:");
        int number = scanner.nextInt();

        int revers = 0;

        while (number != 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + revers);
        scanner.close();
    }
}