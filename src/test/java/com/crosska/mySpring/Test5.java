package com.crosska.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {

        // Proceed without destroy method

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
       Dog dog = context.getBean("Doggich", Dog.class);
       dog.say();

    }

}
