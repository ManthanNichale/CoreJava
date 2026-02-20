package com.techouts.cj5.thisKeyword;

public class Studentthis {
    String name= "Understanding the this keyword";
    int task =2;


    void m1(){
        String name="Is the local variable ";
        int task=1;

        System.out.println(this.name);
        System.out.println(this.task);
    }
    static void main() {
Studentthis ref = new Studentthis();
ref.m1();
    }

}
