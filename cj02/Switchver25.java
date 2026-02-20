package com.techouts.cj02;

public class Switchver25 {

    public static void main(String[]args) {


        int day = 8;

        String dayName = switch (day) {
            case 1 ,8-> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(dayName);
    }
}
