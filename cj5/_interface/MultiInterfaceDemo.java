package com.techouts.cj5._interface;
import java.util.Scanner;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Photo clicked!");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

public class MultiInterfaceDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Take Photo  2. Play Music");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            phone.takePhoto();
        } else if (choice == 2) {
            phone.playMusic();
        } else {
            System.out.println("Invalid choice");
        }
    }
}