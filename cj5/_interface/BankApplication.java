package com.techouts.cj5._interface;

import java.util.Scanner;

import java.util.Scanner;

public class BankApplication {
    interface Bank {
        void Diposit();
        void Withdraw();
        void Check();
    }

    static class Account implements Bank {
        double cash;

        @Override
        public void Diposit() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Cash");
            cash = sc.nextDouble();

            if (cash < 100000) {
                System.out.println("Diposited successful ");
            } else {
                System.out.println("Limited case insert under 100000 Today");
            }
        }

        @Override
        public void Withdraw() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Cash Withdraw");
            cash = sc.nextDouble();
            System.out.println("Enter your Pin");
            double Pin = sc.nextDouble();

            if (Pin == 5107) {
                System.out.println("Take the cash");
            } else {
                System.out.println("Sorry, incorrect pin");
            }
        }

        @Override
        public void Check() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Full Name");
            String Blance = sc.nextLine();

            if (Blance.equals("Rajiv")) {
                System.out.println("Balance is = 45678.70");
            } else {
                System.out.println("Not match");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Account o = new Account();

            System.out.println("1. Diposit , 2. Withdraw , 3. Check ");
            System.out.println("* ----------------------------------- *");
            System.out.print("Enter your choice: ");
            int i = sc.nextInt();

            if(i == 1){
                o.Diposit();
            } else if (i == 2) {
                o.Withdraw();
            } else if (i == 3) {
                o.Check();
            } else {
                System.out.println("Invalid choice");
            }


        }
    }
}