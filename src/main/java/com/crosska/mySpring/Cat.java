package com.crosska.mySpring;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("\nMeow-meow\n");
    }

}
