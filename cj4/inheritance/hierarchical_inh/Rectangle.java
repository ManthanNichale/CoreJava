package com.techouts.cj4.inheritance.hierarchical_inh;



class Rectangle extends Sharp {
    int length, width;

    Rectangle(String color, int length, int width) {
        super(color); // Call parent constructor
        this.length = length;
        this.width = width;
        System.out.println("Length: " + length + ", Width: " + width);
    }
}