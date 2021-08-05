package com.calltouch.pattern.structural.adapter.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableAdapterImplTest {

    @Test
    void getSpeedTest() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}