package com.techouts.cj4.inheritance.hierarchical_inh;

public class  Circle extends Sharp {
    int radius;

    Circle(String color, int radius) {
        super(color); // Call parent constructor
        this.radius = radius;
        System.out.println("Radius: " + radius);
    }
}