package com.techouts.cj7.collection.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hash_map1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value and key");
        HashMap<Integer,String> list = new HashMap<>();
        for(int i=1;i<4;i++){
            int r=sc.nextInt();
            String s=sc.nextLine();
            list.put(r,s);
        }
       for(Map.Entry<Integer,String> entry:list.entrySet()){

       }

        System.out.println(list);
        }


    }


