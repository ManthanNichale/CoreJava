package com.techouts.cj7.collection.linkedlist;
import java.util.LinkedList;
public class Linkedlists {

    static void main() {
        LinkedList<Integer> list=new LinkedList();

        list.add(12);
        list.addFirst(11);
        list.addFirst(34);
        list.addLast(44);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
