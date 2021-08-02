package com.calltouch.pattern.creational.baeldung;

public class Duck implements com.calltouch.pattern.creational.baeldung.Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}