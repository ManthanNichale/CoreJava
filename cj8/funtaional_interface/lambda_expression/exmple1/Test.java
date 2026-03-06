package com.techouts.cj8.funtaional_interface.lambda_expression.exmple1;

public class Test{
    static void main() {
        Interf i=(a, b)-> System.out.println(a+b); //Lambda Expression this is connected Functional Interface
            i.add(12,45);
            i.add(12,56);
            i.add(44,66);
            i.add(56,89);

    }
}