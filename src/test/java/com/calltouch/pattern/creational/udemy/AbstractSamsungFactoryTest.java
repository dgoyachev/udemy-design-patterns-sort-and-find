package com.calltouch.pattern.creational.udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractSamsungFactoryTest {

    @Test
    public void factoryTest() {
        IMobile samsungMobilePhone = new Samsung();
        MobileClient samsungClient = new MobileClient(samsungMobilePhone);
        System.out.println(samsungClient.getAndroidPhoneDetails());
        System.out.println(samsungClient.getIOSPhoneDetails());
    }
}