package com.techouts.cj8.funtaional_interface.lambda_expression.exmple2;

public class Test2 {

    static void main() {

        Square i =(a -> System.out.println(a*a));
        i.square(2);
        i.square(8);
    }
}
