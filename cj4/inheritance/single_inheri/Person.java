package cj4.inheritance.single_inheri;

class Person {

    String name;
    int age;
    String country;

    // Parent Constructor
    Person(String ename, int age, String country) {
        this.name = ename;
        this.age = age;
        this.country = country;


    }

    void displayPerson() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("--------------------------------");
    }
}