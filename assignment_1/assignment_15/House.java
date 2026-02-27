package com.techouts.assignment_1.assignment_15;

public class House {
    private Room room;   // House HAS-A Room

    House() {
        room = new Room();   // Room is created inside House
    }

    void showHouse() {
        System.out.println("House is created");
        room.showRoom();
    }
}


