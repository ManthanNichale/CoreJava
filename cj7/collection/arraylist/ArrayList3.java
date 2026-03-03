package com.techouts.cj7.collection.arraylist;

import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList3 {
    static void main()  {


      ArrayList<String> list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        try {
            for (int i = 1; i < 6; i++) {
                String r = sc.nextLine();
                list.add(r);
            }
            for (int i = 0; list.size() < 6; i++) {

                System.out.println(list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e){
           // System.out.println(e);
        }
        finally {
            System.out.println("End");
        }
        }
}
