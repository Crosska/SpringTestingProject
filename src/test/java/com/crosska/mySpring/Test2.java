package com.crosska.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("Doggich", Pet.class);
        pet.say();
        context.close();
    }
}
