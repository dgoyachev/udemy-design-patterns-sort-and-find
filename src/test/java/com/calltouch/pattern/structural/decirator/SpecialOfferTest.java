package com.calltouch.pattern.structural.decirator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialOfferTest {

    @Test
    public void decoratorTest() {
        Car car = new Car();
        assertEquals(car.getPrice(), 1_000_000);
        SpecialOffer offer = new SpecialOffer(car);
        assertEquals(offer.getPrice(), 1_000_000);
        offer.setDiscountPercentage(50);
        assertEquals(offer.getPrice(), 500_000);
    }

}