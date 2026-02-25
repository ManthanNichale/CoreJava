package com.techouts.cj5.overriding;

public class ClassB {


    String m1(int x){

        System.out.println("Class - A method called");
        return "Improve";
    }
    void m2(int x,String sr){
        System.out.println("Class-A method() called");

    }
    protected  void m3(){
        System.out.println("class-A method 4()");
    }
    static void m4(){
        System.out.println("class method4");
    }

}