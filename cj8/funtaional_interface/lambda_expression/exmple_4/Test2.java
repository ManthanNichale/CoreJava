package com.techouts.cj8.funtaional_interface.lambda_expression.exmple_4;
import java.util.Objects;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        String r=sc.nextLine();
        System.out.println("Enter two number");
        int f= sc.nextInt();
        int s=sc.nextInt();
        if (Objects.equals(r, "add")) {
            Interf operation = (a, b) -> System.out.println("Addition = " + (a + b));
            operation.cal(f, s);

        } else if (Objects.equals(r, "mul")) {
            Interf operation = (a, b) -> System.out.println("Multiplication = " + (a * b));
            operation.cal(f, s);

        } else if (Objects.equals(r, "sub")) {
            Interf operation = (a, b) -> System.out.println("Subtraction = " + (a - b));
            operation.cal(f, s);

        } else if (Objects.equals(r, "div")) {
            Interf operation = (a, b) -> System.out.println("Division = " + (a / b));
            operation.cal(f, s);
        }
    }
}