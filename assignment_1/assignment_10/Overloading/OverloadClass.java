package com.techouts.assignment_1.assignment_10.Overloading;

public class OverloadClass {

    void m1(int i){
        System.out.println(i+10);
    }
    void m1(String s){
        System.out.println("Learning "+" "+s);
    }
   public int m1(int i,int j){
        int c=i+j;
       System.out.println(c);

       return c;

   }

    static void main() {
OverloadClass ref= new OverloadClass();
ref.m1(11);
ref.m1("Java");
ref.m1(12,4);
    }
}
