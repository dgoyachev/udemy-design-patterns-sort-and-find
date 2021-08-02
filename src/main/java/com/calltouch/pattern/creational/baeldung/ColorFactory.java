package com.calltouch.pattern.creational.baeldung;

import java.util.Locale;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String value) {
        switch (value.toLowerCase(Locale.ROOT)) {
            case "white":
                return new White();
            case "black":
                return new Black();
        }
        return null;
    }
}
