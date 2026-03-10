package com.techouts.assignment_3;
//Write a Java program to find the second largest element in an ArrayList.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Largestlement {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();


        List.add(34);
        List.add(67);
        List.add(89);
        List.add(160);
        List.add(322);
        List.add(644);
        List.add(11);

        Collections.sort(List);
        System.out.println(List);
int Secondlargest=List.get(List.size()-2);
        System.out.println("second largest element"+" "+Secondlargest);
    }
}
