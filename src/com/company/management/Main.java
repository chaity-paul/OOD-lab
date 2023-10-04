package com.company.management;


public class Main {
    public static void main(String[] args) {
        PetManagement petManagement = new PetManagement();
        Pet dog = new Dog("tommy");
        Pet cat = new Cat("Mini");
        Pet bird = new Bird("Tia");
        petManagement.addPet(dog);
        petManagement.addPet(cat);
        petManagement.addPet(bird);
        petManagement.exercisePet();
        petManagement.sleepPet();
        petManagement.giveMeal();
        petManagement.removePet(dog);


    }
}
