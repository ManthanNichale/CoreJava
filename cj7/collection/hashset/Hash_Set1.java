package com.techouts.cj7.collection.hashset;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;
public class Hash_Set1 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        try {
        System.out.println("Enter number");
        int r= sc.nextInt();
        HashSet<Integer> list = new HashSet<>();

            for (int i = 0; i < r; i++) {
                int s = sc.nextInt();
                list.add(s);
            }
            for (Integer e : list) {
                System.out.println(e);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Insert only Interger(Numbers)");
        }
    }
}
