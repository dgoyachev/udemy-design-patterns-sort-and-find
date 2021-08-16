package com.calltouch.pattern.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    public void proxyTest() {
        Proxy proxy = new Proxy();
        assertNotEquals(proxy.GetSecretInfo(true), -1);
        assertEquals(proxy.GetSecretInfo(false), -1);
    }
}