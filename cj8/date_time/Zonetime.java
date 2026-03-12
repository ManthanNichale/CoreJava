package com.techouts.cj8.date_time;

import com.techouts.assessment_1.assignment_13.main;
//In Java, Zone refers to Time Zones (different time areas of the world);
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zonetime {

    void m1(){
//Compare Two Time Zones
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("India Time: " + india);
        System.out.println("USA Time: " + usa);
    }
    public static void main(String[] args) {

                System.out.println(ZoneId.getAvailableZoneIds());
                ZoneId zone = ZoneId.systemDefault();
                System.out.println(zone);

            }
        }


