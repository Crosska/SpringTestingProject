package com.crosska.mySpring;

public class Person {

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello! ");
        pet.say();
    }

}
