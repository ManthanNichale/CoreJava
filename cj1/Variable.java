package cj1;

public class Variable {
    int x=12;
    static int y=14;
    void method(){
       int z=16;
       //Instance Variable have present the Two ways to Access variable
       System.out.println("Instance Variable Identifer name= " + x);
       System.out.println("Instace variable Class Object= " + new Variable().x);

        //Static Variable have present the Three ways to Access variable
       System.out.println("Static Identifer Name Variable= " +z);
        System.out.println("Static variable Class Object= " + new Variable().y);
        System.out.println("Static variable Class Name= " + Variable.y);

        //Local Variable have present only one way

        System.out.println("Local  variable Identifer name= " + z);


    }
    public static void main(String []args) {
        Variable obj1 = new Variable();
        obj1.method();
    }
}
