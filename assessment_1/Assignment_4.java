package com.techouts.assessment_1;

public class Assignment_4 {

   void Prime() {
       boolean Prim = false;
       int n;
       for (n = 1; n <= 100; n++) {
           if (n < 2) {
               continue;
           }
           Prim = true;
           for (int i = 2; i < n; i++) {
               Prim = false;
               break;
           }
       }
       if (Prim)
           System.out.println(n);

   }


    static void main() {

    }
}
