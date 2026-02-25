package com.techouts.cj6.string.class_method;

import java.util.Locale;

public class Demo_String {
    Demo_String(String s){
        s=s.concat("Live");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase(Locale.ROOT));
    }
    static void main() {


        Demo_String str= new Demo_String(" Java ");

    }
}
