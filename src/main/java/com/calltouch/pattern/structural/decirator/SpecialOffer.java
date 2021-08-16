package com.calltouch.pattern.structural.decirator;

public class SpecialOffer extends VehicleDecorator {

    private int discountPercentage = 0;
    private String offer;

    public SpecialOffer(ICar vehicle) {
        super(vehicle);
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        int percentage = 100 - discountPercentage;
        return Math.round((price * percentage) / 100);
    }
}
