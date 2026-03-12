package com.techouts.cj8.date_time;

import java.time.LocalDate;

public class localDate {
    static void main() {
//write the date as costom and today date minusDays
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate custom = LocalDate.of(1190, 2, 10);
LocalDate custome =today.minusDays(2);
        LocalDate yesterday  = today.minusDays(1);
        LocalDate pastDate = today.minusMonths(2);

        System.out.println("Custom Date: " + custome);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("2 Months Ago: " + pastDate);
    }
}
