package com.techouts.cj7.collection.hashmap;
import java.util.HashMap;
public class Hash_Map {

    static void main() {
        HashMap<Integer,String> list = new HashMap<>();
        list.put(1,"Integer");
        list.put(2,"String");
        list.put(3,"double");
        list.put(4,"Boolean");
        list.put(5,"Integer");
String s=list.get(4);
        System.out.println(s);

        System.out.println(list);
    }
}
