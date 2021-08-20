package com.calltouch.pattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    @Test
    public void strategyTest() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.doLogic();

        context.setStrategy(new ConcreteStrategyB());
        context.doLogic();
    }
}