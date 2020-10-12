package com.pboreg;

public class if_Else {

    //create  a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        }

        //If age is greater than 18, print "acces granted"
        else {
            System.out.println("Acces granted - You are old enough");
        }
    }

    public static void main(String[]args) {
        checkAge(20); // Call the chechAge method and pass along an age of 20
    }
}
