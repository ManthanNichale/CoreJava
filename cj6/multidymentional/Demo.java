package com.techouts.cj6.multidymentional;

public class Demo {
void m1(){
    int [][] a={{10,20,30},{40,50},{70}};
    System.out.println(a[0][1]);
    System.out.println(a);
    System.out.println(a.length);
    System.out.println(a[0].length);
    System.out.println(a[1].length);
}
void  m2(){
    int [][]a={{2,4,6,8},{3,6,9},{4,8}};

    for(int i=0;i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
}
    static void main(String[]args) {
Demo re = new Demo();


re.m1();
re.m2();
    }
}
