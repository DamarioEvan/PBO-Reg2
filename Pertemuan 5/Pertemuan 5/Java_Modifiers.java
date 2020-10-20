package com.pboreg;

abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Student extends Person {
    public int graduationyear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}

class Myclass {
    public static void main(String[] args) {
        Student myOBJ = new Student();

        System.out.println("Name: " + myOBJ.fname);
        System.out.println("Age: " + myOBJ.age);
        System.out.println("Graduation year: " + myOBJ.graduationyear);
        myOBJ.study();
    }
}