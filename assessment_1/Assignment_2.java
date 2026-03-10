package com.techouts.assessment_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_2 {

    void Number() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Number");
            int num = sc.nextInt();  // Move inside try block

            if (num == 0) {
                System.out.println("You Number is 0");
            } else if (num > 0) {
                System.out.println("Your Number is Positive" + " " + num);
            } else if (num < 0) {
                System.out.println("Your number is Negative" + " " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter an integer.");
        } finally {
            System.out.println("End");
        }
    }

    public static void main(String[] args) {
        Assignment_2 ref = new Assignment_2();
        ref.Number();
    }
}