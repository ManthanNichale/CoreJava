package com.techouts.assessment_4.implementto_interface;

public class C implements A,B{
   public  static void main(String []args) {
           C obj = new C();
           obj.show();  // Output: Interface A
       }

    @Override
    public void show() {
        A.super.show();
    }
}

