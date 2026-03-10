package com.techouts.assessment_1.assignment_26;
import java.util.Arrays;

public class Array {

    public class Main {
        public static void main(String[] args) {
            int[] arr1 = {5, 2, 8, 1, 9};
            int[] arr2 = {5, 2, 8, 1, 9};

            Arrays.sort(arr1);
            System.out.println("Sorted arr1: " + Arrays.toString(arr1));

            int index = Arrays.binarySearch(arr1, 8);
            System.out.println("Index of 8 in arr1: " + index); // 3

            boolean isEqual = Arrays.equals(arr1, arr2);
            System.out.println("arr1 equals arr2? " + isEqual);

            int[] arr3 = Arrays.copyOf(arr1, arr1.length);
            System.out.println("Copy of arr1: " + Arrays.toString(arr3));
        }
    }
}
