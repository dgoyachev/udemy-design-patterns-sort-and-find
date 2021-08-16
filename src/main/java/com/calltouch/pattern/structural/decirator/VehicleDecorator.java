package com.calltouch.pattern.structural.decirator;

public abstract class VehicleDecorator implements ICar {
    private final ICar vehicle;

    public VehicleDecorator(ICar vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getType() {
        return vehicle.getType();
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice();
    }
}
