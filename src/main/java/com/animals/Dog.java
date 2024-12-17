package com.animals;

public class Dog extends Animal implements WalkAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks.");
    }
}
