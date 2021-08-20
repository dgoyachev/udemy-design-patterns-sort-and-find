package com.calltouch.pattern.behavioral.visitor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void clientCode() {
        Client.clientCode(List.of(new ConcreteComponent1(), new ConcreteComponent2()), new ConcreteVisitor1());
        Client.clientCode(List.of(new ConcreteComponent1(), new ConcreteComponent2()), new ConcreteVisitor2());
    }
}