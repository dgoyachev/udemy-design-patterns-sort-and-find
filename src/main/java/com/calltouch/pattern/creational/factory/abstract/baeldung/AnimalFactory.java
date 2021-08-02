package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class AnimalFactory implements com.calltouch.pattern.creational.baeldung.AbstractFactory<com.calltouch.pattern.creational.baeldung.Animal> {

    @Override
    public com.calltouch.pattern.creational.baeldung.Animal create(String value) {

        switch (value.toLowerCase(Locale.ROOT)) {
            case "dog":
                return new com.calltouch.pattern.creational.baeldung.Dog();
            case "duck":
                return new com.calltouch.pattern.creational.baeldung.Duck();
        }

        return null;
    }

}