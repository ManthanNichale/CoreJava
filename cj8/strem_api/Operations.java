package com.techouts.cj8.strem_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {

   public static  void main(String[] args) {
       //list
       List<Integer> list = Arrays.asList(90, 89, 100, 12, 13, 78, 15, 17, 56, 18);
       List<Integer> liat1 = list.stream().filter(i -> !(i % 2 == 0)).toList();
       System.out.println(liat1);


//map
       List<Integer> liat2 = list.stream().map(i -> (i * 2)).toList();
       System.out.println(liat2);

       //reverse sort
       List<Integer> list3 = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
       System.out.println(list3);


       //sorted
       List<Integer> list4 = list.stream().sorted().collect(Collectors.toList());
       System.out.println(list4);

       //min and max

       List<String> list5 = Arrays.asList("AAA","BBBB","BB","AA","CC");
       Comparator<String> c = (a, b) -> {
           int l = a.length();
           int t = b.length();

           return Integer.compare(l,t);


       };
           String smin = list5.stream().min(c).get();
           System.out.println(smin);

   }
}
