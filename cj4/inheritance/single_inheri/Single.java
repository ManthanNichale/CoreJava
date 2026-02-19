package cj4.inheritance.single_inheri;

public class Single {  public static void main(String[] args) {

    System.out.println("Main Method Started");

    //Single ref = new Single();

    Student s1 = new Student("John", 20, "USA", 101, "Computer Science");
    s1.displayStudent();
    System.out.println("--------------------------------");

    s1.displayPerson();

}

}
