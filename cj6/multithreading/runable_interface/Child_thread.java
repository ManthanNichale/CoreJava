package com.techouts.cj6.multithreading.runable_interface;

public class Child_thread {

    static void main(String[] args) {
        for(int i=1;i<5;i++){
            System.out.println("Child");
        }
        Parent_thread t=new Parent_thread();
        Thread o=new Thread(t);
        o.start();
    }
}
