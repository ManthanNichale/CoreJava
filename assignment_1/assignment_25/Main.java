package com.techouts.assignment_1.assignment_25;
public class Main {
    public static void main(String[] args) {
        // 1. String (immutable)
        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);

        // 2. StringBuilder (mutable, non-thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");//
        System.out.println("StringBuilder: " + sb);

        // 3. StringBuffer (mutable, thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World"); //
        System.out.println("StringBuffer: " + sbf);
    }
}
