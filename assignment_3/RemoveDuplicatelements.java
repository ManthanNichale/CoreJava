package com.techouts.assignment_3;
//Write a Java program to remove duplicate elements from a List.

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatelements {
  public   static void main(String []args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(16);
        list.add(15);
       list.add(16);
        System.out.println();

        HashSet<Integer>list1=new HashSet<>(list);
        System.out.println(list1);
    }



}
