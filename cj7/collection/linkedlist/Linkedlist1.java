package com.techouts.cj7.collection.linkedlist;

import java.util.Scanner;
import  java.util.LinkedList;
public class Linkedlist1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter String");

        for(int i=1;i<5;i++){
            String s = sc.nextLine();
            System.out.println("Enter Next String");

            list.add(s);
        }
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e){

        }
        finally {
            System.out.println("End");
        }
    }
}
