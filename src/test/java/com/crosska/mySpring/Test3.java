package com.crosska.mySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        /*Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("Person", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname() + " " + person.getAge());

        context.close();
    }

}
