package com.techouts.cj6.multithreading;


public class First_Thread extends Thread {

  public void run() {//this present the thread or run() this is override
       try {
          for (int i = 1; i < 5; i++) {
              System.out.println("Manthan");
              Thread.sleep(1000);
          }
      }
      catch(InterruptedException  e){

          }


      }
  }
