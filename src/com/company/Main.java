package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the Pet class
class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type;
    }
}

// Define the PetManager class to manage a list of pets
class PetManager {
    private List<Pet> pets;

    public PetManager() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(String name) {
        pets.removeIf(pet -> pet.getName().equals(name));
    }

    public void displayPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets in the system.");
        } else {
            System.out.println("List of Pets:");
            for (Pet pet : pets) {
                System.out.println(pet);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetManager petManager = new PetManager();

        while (true) {
            System.out.println("\nPet Management System Menu:");
            System.out.println("1. Add a pet");
            System.out.println("2. Remove a pet");
            System.out.println("3. Display all pets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    System.out.print("Enter pet type: ");
                    String petType = scanner.nextLine();
                    Pet newPet = new Pet(petName, petType);
                    petManager.addPet(newPet);
                    System.out.println("Added " + newPet);
                    break;
                case 2:
                    System.out.print("Enter the name of the pet to remove: ");
                    String petToRemove = scanner.nextLine();
                    petManager.removePet(petToRemove);
                    System.out.println("Removed " + petToRemove);
                    break;
                case 3:
                    petManager.displayPets();
                    break;
                case 4:
                    System.out.println("Exiting the Pet Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

