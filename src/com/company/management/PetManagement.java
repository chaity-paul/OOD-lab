package com.company.management;
import java.util.ArrayList;
import java.util.List;

public class PetManagement {
    private List<Pet> myPets;
    public PetManagement(){
        myPets = new ArrayList<>();
    }
    public void addPet(Pet pet){
        myPets.add(pet);
        System.out.println(pet.getName() + " has been added.");
    }
    public void removePet(Pet pet){
        myPets.remove(pet);
        System.out.println(pet.getName() + " has been removed.");
    }
    public void giveMeal(){
        for(Pet pet : myPets){
            System.out.println(pet.eat());
        }
    }
    public void exercisePet(){
        for(Pet pet : myPets){
            System.out.println(pet.exercise());
        }
    }
    public void sleepPet(){
        for(Pet pet : myPets){
            System.out.println(pet.sleep());
        }
    }

}



