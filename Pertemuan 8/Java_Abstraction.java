package com.pboreg;

// Abstract class
abstract class animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class pig extends animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Java_Interface {
    public static void main(String[] args) {
        pig myPig = new pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

