package com.techouts.assignment_1.assignment_27;

    public class Main {
        public static void main(String[] args) {
            int[] arr = {5, 8, 2, 10, 3};

            int max = arr[0];
            int min = arr[0];
            int sum = 0;

            // Traverse the array
            for (int num : arr) {
                if (num > max) max = num;
                if (num < min) min = num;
                sum += num;
            }

            double average = (double) sum / arr.length;

            // Display results
            System.out.println("Array elements: ");
            for (int num : arr) System.out.print(num + " ");
            System.out.println("\nMaximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.println("Average: " + average);
        }
    }

