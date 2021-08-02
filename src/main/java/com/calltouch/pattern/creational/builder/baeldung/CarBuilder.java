package com.calltouch.pattern.creational.builder.baeldung;

public class CarBuilder {

    public Car build() {
        String make = "Ford";
        String model = "Fiesta";
        int doors = 4;
        String color = "White";
        return new Car(make, model, doors, color);
    }
}
