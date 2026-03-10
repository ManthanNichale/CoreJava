package com.techouts.assessment_1.assignment_10.overrid;

public  class Overrid2 {
    String m1(int x) {

        System.out.println("Class -B method called");
        return "Improve";
    }

    void m2(int x, String sr) {
        System.out.println("Class-B method() called");

    }

    protected void m3() {

        System.out.println("class-B method 4()");
    }

    static void m4() {

        System.out.println("class method4");
    }
}