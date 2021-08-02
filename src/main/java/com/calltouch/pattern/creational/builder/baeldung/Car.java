package com.calltouch.pattern.creational.builder.baeldung;

public class Car {

    private final String make;
    private final String model;
    private final int doors;
    private final String color;

    public Car(String make, String model, int doors, String color) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                '}';
    }
}
