package com.techouts.cj8.funtaional_interface.lambda_expression.exmple1;
//It is Anonymous function
//No name
//No return type;
//No AccessModifier
import java.util.function.Function;//they have present the parameter,logic and body
import java.util.function.Predicate;//mean goal is reduced the code

public class Demo{
void m1() {

        Function<Integer, Integer> f = i -> i * i;
        System.out.println("square " + f.apply(4));
        System.out.println("square " + f.apply(9));
    }
void m2(){
Predicate<Integer> t= i ->i%2==0;
    System.out.println(t.test(4));
    }
    void m3(){


    }
    void main() {
        Demo o = new Demo();
        o.m1();
    }
}