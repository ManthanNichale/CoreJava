package com.techouts.cj6.array_class;

import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    static void main(String []args) {
        System.out.println("Enter Arrays 1");
        Scanner sc = new Scanner(System.in);
        int  a[]=new int [5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.print(a[i]);
        }

        System.out.println("Enter Arrays 2");
        int  a1[]=new int [5];
        for(int i=0;i<5;i++){
            a1[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.print(a1[i]);
        }
        System.out.println(Arrays.equals(a,a1));

    }
}
