package com.techouts.assessment_1.assignment_10.overrid;

public class Test {
    public static void main(String [] args) {
        Overrid2 obj = new Overrid2();
        obj.m1(88);
        obj.m2(90,"ClassA");
        obj.m3();
        System.out.println("___________________________");
        Overrid1 obj1 =new Overrid1();
        obj.m1(55);
        obj.m2(78,"ClassB");
        obj.m3();
    }
}
