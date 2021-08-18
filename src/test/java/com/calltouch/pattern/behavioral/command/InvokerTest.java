package com.calltouch.pattern.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {

    @Test
    void getCommand() {
        Invoker invoker = new Invoker();
        invoker.getCommand("Hello").execute();
        invoker.getCommand("Goodbye").execute();
    }
}