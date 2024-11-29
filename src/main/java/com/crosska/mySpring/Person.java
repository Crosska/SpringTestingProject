package com.crosska.mySpring;

public class Person {
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

    private String surname;
    private int age;

    public Person() {

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello! ");
        pet.say();
    }

}
