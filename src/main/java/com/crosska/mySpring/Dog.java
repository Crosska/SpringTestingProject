package com.crosska.mySpring;

public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("\nBow-wow!\n");
    }

    public void init() {
        System.out.println("Dog's init method proceeded");
    }

    public void destroy() {
        System.out.println("Dog's destroy method proceeded");
    }

}
