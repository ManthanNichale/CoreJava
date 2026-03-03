package com.techouts.cj7.collection.arraylist;

import java.util.ArrayList;

public class ArrayList2 {

    static void main() {
        ArrayList<String> list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);
        list.add(2,"G");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(0,"R");
        System.out.println("-------------------------------");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
