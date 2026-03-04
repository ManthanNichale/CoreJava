package com.techouts.cj7.collection.treemap;

import java.util.TreeMap;

public class Treemap {
    static void main() {
        TreeMap<Integer,String> list= new TreeMap<>();
        list.put(5,"E");
        list.put(1,"A");
        list.put(3,"C");
        list.put(6,"F");
        list.put(0,"-a");
        System.out.print(list);
        System.out.println(list.get(3));
    }

}
