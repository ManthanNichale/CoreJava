package com.techouts.cj8.strem_api;


import java.util.*;
import java.util.stream.*;

public class Demo2 {

    void m1(){

        ArrayList<Integer> lis=new ArrayList<>();
        lis.add(11);
        lis.add(12);
        lis.add(13);
        lis.add(14);
        System.out.println(lis);
        Stream<Integer> stream=lis.stream();
        List<Integer> newlists=  stream.filter(i-> i%2==0 ).collect(Collectors.toList());
        System.out.println(newlists);

        List<Integer> sl = lis.stream()
                .filter(j -> j > 13)
                .collect(Collectors.toList());

        System.out.println(sl);
    }
    void m2(){
        Stream<Object> empty=Stream.empty();
        //array object collection
        String name[]={"manthan","Nichale"};
        Stream<String>str1=Stream.of(name);
        str1.forEach(e-> System.out.println(e));
    }
    void m3(){

        ArrayList<Integer> o=new ArrayList<>();
        o.add(11);
        o.add(122);
        o.add(34);
        o.add(56);
        o.add(67);
        o.add(78);

        Stream<Integer> stream=o.stream();
        stream.forEach(e -> System.out.println(e));
    }
    void m4(){
        //finding the starting element A
        List<String> list= List.of("Aishan","Aman","Balaji","Rajjiv","Ajite","Nana");

       List<String>name = list.stream().filter(e->e.startsWith("B")).toList();
        System.out.println(name);

        //map function

        List<Integer>list1=List.of(12,11,14,17,16);
        List<Integer>square=list1.stream().map(e->e*e).sorted().collect(Collectors.toList());
        System.out.println(square);
list1.stream().forEach(e-> System.out.print(" "+e));
    }
    static void main() {
Demo2 o = new Demo2();
         //o.m1();
         // o.m2();
         // o.m3();
        o.m4();

}


    }

