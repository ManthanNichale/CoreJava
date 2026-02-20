package com.techouts.cj5.abstrac;

public class Car extends Vihical {


    public void Accelerate() {
        System.out.println(("Control It"));

    }

    public void Break() {
        System.out.println("Working it ");
    }

    void speed() {
        System.out.println("Enter yours Speed ");
        int sp = sc.nextInt();
        int sp1 = sp;
        String Display = switch (sp1) {
            case 100, 110 -> "highway";
            case 70, 90 -> "Road";
            case 50, 60 -> "Mahamarg";
            case 20, 30 -> "City";
            default -> "Choise is not match";
        };
        System.out.println(Display);
    }
}