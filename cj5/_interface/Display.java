package com.techouts.cj5._interface;

import java.util.Scanner;

public class Display {

    interface Client {
        void Input();
        void Output();
    }

     static class Developer implements Client {

        Scanner sc = new Scanner(System.in);
         String name;
         int number;


        public void Input() {
            System.out.println("Enter Number:");
             number = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
             name = sc.nextLine();

        }
            public void Output () {
                System.out.println("Number: " + number);
                System.out.println("Name: " + name);
            }
        }

    public static void main(String[] args) {
        Developer obj = new Developer();
        obj.Input();
        obj.Output();
    }
}