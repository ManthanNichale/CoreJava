package com.techouts.cj7.collection.arraylist;

import java.util.ArrayList;

public class ArrayLists {
    static void main() {
        ArrayList<Integer> list = new ArrayList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list);
        list.add(2,3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(0,16);
        System.out.println("-------------------------------");
        System.out.println(list);
    }


}
