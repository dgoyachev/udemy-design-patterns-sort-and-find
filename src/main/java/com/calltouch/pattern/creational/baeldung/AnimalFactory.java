package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String value) {

        switch (value.toLowerCase(Locale.ROOT)) {
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
        }

        return null;
    }

}