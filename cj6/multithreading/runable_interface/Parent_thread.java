package com.techouts.cj6.multithreading.runable_interface;

public class Parent_thread implements Runnable {
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("Parent");
        }
    }
}
