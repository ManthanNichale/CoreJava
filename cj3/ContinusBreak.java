package cj3;
import java.util.Scanner;
public class ContinusBreak {


        public static void main(String[] args) {

            int sum = 0;  // To keep track of sum

            for (int i = 1; i <= 10; i++) {

                if (i == 3) {
                    System.out.println("Skipping number " + i);  // Message for continue
                    continue;  // Skip number 3
                }

                if (i == 7) {
                    System.out.println("Stopping loop at number " + i);  // Message for break
                    break;  // Stop loop completely
                }

                System.out.println("Current number: " + i);
                sum += i;  // Add to sum
            }

            System.out.println("Sum of printed numbers: " + sum);
        }
    }








