package com.techouts.cj7.collection.linkehashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class LinkedHashmap {


    static void main() {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,String> list=new LinkedHashMap<>();
        System.out.println("Enter ");
        for(int i=0;i<5;i++){
            int r=sc.nextInt();
            String e= sc.nextLine();
            list.put(r,e);
        }
        for (Map.Entry<Integer,String>e:list.entrySet()){

        }
        System.out.println(list);
    }
    }

