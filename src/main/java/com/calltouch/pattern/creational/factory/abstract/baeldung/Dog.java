package com.calltouch.pattern.creational.baeldung;

public class Dog implements com.calltouch.pattern.creational.baeldung.Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Wooof";
    }
}
