package com.company.management;

public class Pet {
    public String name = "Tommy";
    public String type = "dog";

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public String getExerciseList() {
        return exerciseList;
    }

    public String food = "dog";
    public String exerciseList = "";

    public String eat() {
        return this.name + " is eating " + this.food;
    }

    public String sleep() {
        return this.name + " is sleeping.";
    }

    public String exercise() {
        return this.name + " is exercise with " + this.exerciseList;
    }

    String getTreatment() {
        return this.name + "is getting treatment.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setExerciseList(String exerciseList) {
        this.exerciseList = exerciseList;
    }
}
