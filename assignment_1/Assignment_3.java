package com.techouts.assignment_1;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number:");
        double n1 = scanner.nextDouble();

        double n2 = scanner.nextDouble();

        System.out.println(" choose ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = n1 + n2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Result: " + result);
                break;
            case 4:
              //  if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result: " + result);
                //} else {
                //    System.out.println("Error: Division by zero is not allowed!");
              //  }
                break;
            default:
                System.out.println("Invalid ");
        }


    }
}