package com.techouts.cj8.funtaional_interface.lambda_expression.exmple3;

public interface Run {
    static void main() {

        Runnable r=()->{
            for(int i=0;i<5;i++){
                System.out.println("Main thread");
            }

        };
        Thread e =new Thread(r);
        e.start();
        for(int i=0;i<5;i++){
            System.out.println("Child thread");
        }
    }
}
