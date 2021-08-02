package com.calltouch.pattern.creational.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProviderTest {

    @Test
    public void factoryTest() {
        com.calltouch.pattern.creational.baeldung.AbstractFactory<?> abstractFactory = com.calltouch.pattern.creational.baeldung.FactoryProvider.getFactory("Animal");
        if(abstractFactory != null) {
            com.calltouch.pattern.creational.baeldung.Animal animal = (com.calltouch.pattern.creational.baeldung.Animal) abstractFactory.create("Dog");
            assertEquals("Dog", animal.getAnimal());
            assertEquals("Wooof", animal.makeSound());
            animal = (com.calltouch.pattern.creational.baeldung.Animal) abstractFactory.create("Duck");
            assertEquals("Duck", animal.getAnimal());
            assertEquals("Squeks", animal.makeSound());
        }

        abstractFactory = com.calltouch.pattern.creational.baeldung.FactoryProvider.getFactory("Color");
        if(abstractFactory != null) {
            com.calltouch.pattern.creational.baeldung.Color color = (com.calltouch.pattern.creational.baeldung.Color) abstractFactory.create("White");
            assertEquals("White", color.getColor());
        }
    }

}