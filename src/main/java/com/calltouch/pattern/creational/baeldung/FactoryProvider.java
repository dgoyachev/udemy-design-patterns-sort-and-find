package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class FactoryProvider {

    public static AbstractFactory<?> getFactory(String choice){

        switch (choice.toLowerCase(Locale.ROOT)) {
            case "animal":
                return new AnimalFactory();
            case "color":
                return new ColorFactory();
        }

        return null;
    }
}