package com.techouts.assignment_1.Assignment_12;

public class Encapsualtion {
    static class Student {
        private String name;
        private int age;

        // Public setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student s = new Student();

            s.setName("John");
            s.setAge(20);

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
        }
    }
}
