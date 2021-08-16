package com.calltouch.pattern.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorObjectFactoryTest {

    @Test
    public void colorTest() {
        ColorObjectFactory factory = new ColorObjectFactory();
        IColor color = factory.getColor("Red");
        color.print();
        color = factory.getColor("Blue");
        color.print();
        color = factory.getColor("Green");
        color.print();
        color = factory.getColor("Red");
        color.print();

        assertEquals(3, factory.total());
    }
}