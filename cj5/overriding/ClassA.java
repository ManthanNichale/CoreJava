package com.techouts.cj5.overriding;

public class ClassA {
     String m1(int i){

        System.out.println("Class - A method called");
        return "Java";
    }
    void m2(int i,String s){
        System.out.println("Class-A method() called");

    }
    protected  void m3(){
        System.out.println("class-A method 4()");
    }
    static void m4(){
        System.out.println("class method4");
    }

}
