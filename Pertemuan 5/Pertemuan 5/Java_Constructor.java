package com.pboreg;

public class Java_Constructor {
    int modelyear;
    String modelname;

    public Java_Constructor(int year, String name) {
        modelyear = year;
        modelname = name;
    }
    public static void main(String[] args) {
        Java_Constructor mycar = new Java_Constructor(1969, "Mustang");
        System.out.println(mycar.modelyear + " " + mycar.modelname);
    }
}
