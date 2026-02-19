package cj4.inheritance.multi_inheritence;

class ElectricCar extends Car {

    int batteryCapacity;
    String range;
    ElectricCar(String Compay, String Color,String Fultype ,String Modual ,int batteryCapacity,String range){
        super(Compay,Color,  Modual,Fultype);
        this.batteryCapacity=batteryCapacity;
        this.range=range;

        System.out.println(Compay);
        System.out.println(Color);
        System.out.println(Modual);
        System.out.println(Fultype);
        System.out.println("-------------------------------------");
    }


}
