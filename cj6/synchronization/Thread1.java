package com.techouts.cj6.synchronization;

class Thread1 extends Thread {
    Table t;
    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}