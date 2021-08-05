package com.calltouch.pattern.structural.adapter.udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    void requestTest() {
        Adapter adapter = new Adapter(new Adaptee());
        assertEquals("This is Request from the client", adapter.request());
    }
}