package cj02;
import java.util.Scanner;

public class Ifelse2 {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== Student Grade Calculator =====");

            // Input Student Name
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            // Input Marks
            System.out.print("Enter Marks in Subject 1: ");
            int sub1 = sc.nextInt();

            System.out.print("Enter Marks in Subject 2: ");
            int sub2 = sc.nextInt();

            System.out.print("Enter Marks in Subject 3: ");
            int sub3 = sc.nextInt();

            System.out.print("Enter Marks in Subject 4: ");
            int sub4 = sc.nextInt();

            System.out.print("Enter Marks in Subject 5: ");
            int sub5 = sc.nextInt();

            // Calculate Total
            int total = sub1 + sub2 + sub3 + sub4 + sub5;

            // Calculate Average
            double average = total / 5.0;

            System.out.println("\n===== Result =====");
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            // Grade Calculation using if-else if-else
            if (average >= 90) {
                System.out.println("Grade: A+");
            } else if (average >= 75) {
                System.out.println("Grade: A");
            } else if (average >= 60) {
                System.out.println("Grade: B");
            } else if (average >= 50) {
                System.out.println("Grade: C");
            } else if (average >= 35) {
                System.out.println("Grade: Pass");
            } else {
                System.out.println("Grade: Fail");
            }

            sc.close();
        }

    public static class Dowhile {

        public static void main(String[]args){
            int n=2;
            do{
                System.out.println(n);

                n++;
            }
            while(n<0);
        }
    }
}


