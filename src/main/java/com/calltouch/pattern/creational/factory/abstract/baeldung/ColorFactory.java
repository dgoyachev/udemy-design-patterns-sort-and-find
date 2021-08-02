package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class ColorFactory implements com.calltouch.pattern.creational.baeldung.AbstractFactory<com.calltouch.pattern.creational.baeldung.Color> {
    @Override
    public com.calltouch.pattern.creational.baeldung.Color create(String value) {
        switch (value.toLowerCase(Locale.ROOT)) {
            case "white":
                return new com.calltouch.pattern.creational.baeldung.White();
            case "black":
                return new com.calltouch.pattern.creational.baeldung.Black();
        }
        return null;
    }
}
