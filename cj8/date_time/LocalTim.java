package com.techouts.cj8.date_time;

import com.techouts.assessment_1.assignment_13.main;

import java.time.LocalTime;


public class LocalTim {
    public static void main(String[] args) {

        LocalTime today = LocalTime.now();
        System.out.println(today);
        LocalTime past=LocalTime.of(10,1);
        System.out.println(past);
        //pass the time from it
        LocalTime time = LocalTime.parse("12:45:30");
        LocalTime t = LocalTime.now();
        LocalTime newTime = t.plusHours(2);

    }
}