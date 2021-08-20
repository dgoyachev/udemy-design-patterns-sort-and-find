package com.calltouch.pattern.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    @Test
    public void stateTest() {
        Context context = new Context(new ConcreteState1());
        context.request();
        context.request();
        context.request();
    }
}