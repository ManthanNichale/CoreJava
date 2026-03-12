package com.techouts.assessment_4.methodrefrence;
// Method reference to instance method single abstract method and runable interface.
public class Test {
    public static void main(String[] args) {

        Massege h = new Massege();


        Runnable r = h::display;

        r.run();
    }
}
