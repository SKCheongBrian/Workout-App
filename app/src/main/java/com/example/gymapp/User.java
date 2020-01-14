package com.example.gymapp;

public class User {
    String name;
    int age, height;
    float weight, bmi;
    boolean isFat;

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int newHeight) {
        height = newHeight;
    }

    float getWeight() {
        return weight;
    }

    void setWeight(float newWeight) {
        weight = newWeight;
    }

    float getBMI() {
        return bmi;
    }

    public User(String name, int age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.bmi = (weight / (height*height)) * 10000;
    }
}


