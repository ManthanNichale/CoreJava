package com.techouts.assessment_4;
//Write a Java 8 program to format and parse dates using LocalDate and DateTimeFormatter.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        // Format date
        String formatted = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formatted: " + formatted);

        // Parse date
        LocalDate parsed = LocalDate.parse("25/03/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Parsed: " + parsed);
    }
}
