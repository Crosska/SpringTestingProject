package com.crosska.mySpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        int age = person.getAge();
        String surname = person.getSurname();
        System.out.println(age + " " + surname);

        /*Person person = context.getBean("personBean", Person.class);
        person.callYourPet();*/

        context.close();

    }

}
