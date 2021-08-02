package com.calltouch.pattern.creational.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProviderTest {

    @Test
    public void factoryTest() {
        AbstractFactory<?> abstractFactory = FactoryProvider.getFactory("Animal");
        if(abstractFactory != null) {
            Animal animal = (Animal) abstractFactory.create("Dog");
            assertEquals("Dog", animal.getAnimal());
            assertEquals("Wooof", animal.makeSound());
            animal = (Animal) abstractFactory.create("Duck");
            assertEquals("Duck", animal.getAnimal());
            assertEquals("Squeks", animal.makeSound());
        }

        abstractFactory = FactoryProvider.getFactory("Color");
        if(abstractFactory != null) {
            Color color = (Color) abstractFactory.create("White");
            assertEquals("White", color.getColor());
        }
    }

}