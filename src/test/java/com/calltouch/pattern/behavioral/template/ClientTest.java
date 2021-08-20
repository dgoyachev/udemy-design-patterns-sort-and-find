package com.calltouch.pattern.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void clientCode() {
        Client.clientCode(new Concrete1());
        Client.clientCode(new Concrete2());
    }
}