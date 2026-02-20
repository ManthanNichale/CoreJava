package com.techouts.cj4.inheritance.multi_inheritence;

class Car extends Vehical{
    String Modual;
    String Fultype;

    Car(String Compay, String Color,String Fultype ,String Modual ){
        super(Compay,Color);
        this.Fultype=Fultype;
        this.Modual=Modual;

    }

}


