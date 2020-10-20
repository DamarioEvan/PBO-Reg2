package com.pboreg;

public class Multiple_Objects {
    int x = 5;

    public static void main(String[] args) {
        Multiple_Objects myobj1 = new Multiple_Objects();
        Multiple_Objects myobj2 = new Multiple_Objects();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
