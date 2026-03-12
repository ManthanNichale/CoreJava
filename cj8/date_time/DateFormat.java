package com.techouts.cj8.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat{
    static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("");

        String formatted = now.format(f);

        System.out.println(formatted);
    }
}