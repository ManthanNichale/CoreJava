package com.techouts.cj7.collection.vector;

import java.util.Scanner;
import java.util.Vector;

public class Vector_  {
    static void main() {
        Vector<String> list=new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Number Size");
        int t=sc.nextInt();
        System.out.println("Enter String");
        for(int i=1;i<=t;i++){
            String s = sc.nextLine();
            list.add(s);
        }
        try {
            for (int i = 0; i< t; i++) {
                System.out.println(list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e){

        }

    }
}
