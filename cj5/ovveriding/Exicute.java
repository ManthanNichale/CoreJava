package com.techouts.cj5.ovveriding;

public class Exicute {
    public static void main(String [] args) {
        ClassB obj = new ClassB();
        obj.m1(88);
        obj.m2(90,"ClassA");
        obj.m3();

        ClassA obj1 =new ClassA();
        obj.m1(55);
        obj.m2(78,"ClassB");
        obj.m3();
    }
}
