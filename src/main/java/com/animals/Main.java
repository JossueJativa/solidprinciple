package com.animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((WalkAnimal) dog).walk();

        fish.makeSound();
    }
}
