package com.calltouch.pattern.structural.decirator;

public class Car implements ICar {
    @Override
    public String getType() {
        return "Tesla";
    }

    @Override
    public double getPrice() {
        return 1_000_000;
    }
}
