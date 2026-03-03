package com.techouts.cj7.collection.hashset;
import java.util.HashSet;
import  java.util.Scanner;
public class Hash_set {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size ");
        int r=sc.nextInt();
        HashSet<String> list =new HashSet<>();//not follow insertion orders
        System.out.println("Enter String");
        for(int i=0 ;i<r;i++){
            String sr = sc.nextLine();
            list.add(sr);
        }
        for(String p:list){
            System.out.print(" "+ p);
        }
    }
}
