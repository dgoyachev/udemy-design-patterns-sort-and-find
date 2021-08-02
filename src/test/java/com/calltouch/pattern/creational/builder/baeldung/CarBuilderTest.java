package com.calltouch.pattern.creational.builder.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {

    @Test
    public void carBuilderTest() {
        Car car = new CarBuilder().build();
        assertEquals("Ford", car.getMake());
        assertEquals("Fiesta", car.getModel());
        assertEquals(4, car.getDoors());
        assertEquals("White", car.getColor());
    }
}