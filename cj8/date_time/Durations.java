package com.techouts.cj8.date_time;
import java.time.LocalTime;
import java.time.Duration;

public class Durations {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(12, 45);

        Duration d = Duration.between(start, end);

        System.out.println(d);
    }
}