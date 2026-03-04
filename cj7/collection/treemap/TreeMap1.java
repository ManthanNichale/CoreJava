package com.techouts.cj7.collection.treemap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TreeMap1 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,String> list=new TreeMap<>();
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
