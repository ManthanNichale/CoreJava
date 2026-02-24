package com.techouts.cj6.exception;

import java.util.Scanner;

public class Demo_Exception {

    void Demo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int F = sc.nextInt();
        int S = sc.nextInt();

        try {
            int R = F / S;
            System.out.println("Result: " + R);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Division is incorrect");
        }
        finally {
            System.out.println("Process is completed");
        }
    }

    public static void main(String[] args) {
        Demo_Exception obj = new Demo_Exception();
        obj.Demo();
    }
}