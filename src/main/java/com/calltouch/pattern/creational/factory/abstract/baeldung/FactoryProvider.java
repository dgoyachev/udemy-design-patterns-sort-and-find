package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class FactoryProvider {

    public static com.calltouch.pattern.creational.baeldung.AbstractFactory<?> getFactory(String choice){

        switch (choice.toLowerCase(Locale.ROOT)) {
            case "animal":
                return new com.calltouch.pattern.creational.baeldung.AnimalFactory();
            case "color":
                return new com.calltouch.pattern.creational.baeldung.ColorFactory();
        }

        return null;
    }
}