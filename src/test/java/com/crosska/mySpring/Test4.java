package com.crosska.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            Dog dog = (Dog) context.getBean("Doggich");
            dog.say();


        } catch (Exception e) {
            System.out.println("Wrong application context");
        }


    }

}
