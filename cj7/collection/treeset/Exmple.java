package com.techouts.cj7.collection.treeset;
import java.util.TreeSet;
import java.util.Scanner;
public class Exmple {

    static void main() {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter Size ");
        int s=sc.nextInt();
        System.out.println("Enter String");
        TreeSet<String> list =new TreeSet<>();
        for(int i=0;i<s;i++){
            String s1= sc.nextLine();
            list.add(s1);
        }
        for (String s2:list){
            System.out.println(s2);
        }
    }
}
