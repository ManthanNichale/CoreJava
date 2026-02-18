package cj02;
import java.util.Scanner;

public class Forloop {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter a number to print its multiplication table: ");
            int number = scanner.nextInt();

            System.out.print("Enter the range of the table: ");
            int range = scanner.nextInt();

            System.out.println("Multiplication table of " + number + ":");

            // For loop to print the table
            for (int i = 1; i <= range; i++) {
                System.out.println(number +  (number * i));

            }




        }
    }






