package com.techouts.cj7.collection.stack;

import java.util.Stack;

public class Stack_ {
    static void main() {


    Stack<Integer> list=new Stack<>();

        list.push(11);
        list.push(44);
        list.push(44);
        list.push(12);
        list.push(null);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.get(0));
}
}
