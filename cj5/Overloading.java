package com.techouts.cj5;
import java.util.Scanner;
public class Overloading {

        int add(int a, int b) {
            return a + b;
        }


        int add(int a, int b, int c) {
            return a + b + c;
        }


        double add(double a, double b) {
            return a + b;
        }

        int multiply(int a, int b) {
            return a * b;
        }

        int multiply(int a, int b, int c) {
            return a * b * c;
        }

        int max(int a, int b) {
            return (a > b) ? a : b;
        }

        int max(int a, int b, int c) {
            return max(max(a, b), c);
        }

        void display(String name) {
            System.out.println("Name: " + name);
        }

        void display(String name, int age) {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Overloading obj = new Overloading();

            System.out.println("Enter two number");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Enter third number");
            int z = sc.nextInt();

            System.out.println("Enter two double numbers:");
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();

            System.out.println("\n--- Results ---");

            System.out.println("Addition of 2 number " + obj.add(x, y));
            System.out.println("Addition of 3 number " + obj.add(x, y, z));
            System.out.println("Addition of 2 number " + obj.add(d1, d2));

            System.out.println("Multiplication of 2 number " + obj.multiply(x, y));
            System.out.println("Multiplication of 3 number " + obj.multiply(x, y, z));

            System.out.println("Maximum of 2 number " + obj.max(x, y));
            System.out.println("Maximum of 3 number " + obj.max(x, y, z));

            sc.nextLine(); // clear buffer
            System.out.println("\nEnter your name:");
            String name = sc.nextLine();

            System.out.println("Enter your age:");
            int age = sc.nextInt();

            obj.display(name);
            obj.display(name, age);

            sc.close();
        }
    }

