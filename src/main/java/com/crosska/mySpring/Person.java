package com.crosska.mySpring;


import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    @Qualifier("catBean")
    @Autowired
    private Pet pet;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

   // @Value("${person.surname}")
    private String surname;
   // @Value("${person.age }")
    private int age;

    //public Person() {    }

    //@Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

   /* @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }*/

    public void callYourPet() {
        System.out.println("Hello! ");
        pet.say();
    }

}
