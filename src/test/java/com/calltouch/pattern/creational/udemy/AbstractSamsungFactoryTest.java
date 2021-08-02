package com.calltouch.pattern.creational.udemy;

import org.junit.jupiter.api.Test;

class AbstractSamsungFactoryTest {

    @Test
    public void factoryTest() {
        com.calltouch.pattern.creational.udemy.IMobile samsungMobilePhone = new com.calltouch.pattern.creational.udemy.Samsung();
        com.calltouch.pattern.creational.udemy.MobileClient samsungClient = new com.calltouch.pattern.creational.udemy.MobileClient(samsungMobilePhone);
        System.out.println(samsungClient.getAndroidPhoneDetails());
        System.out.println(samsungClient.getIOSPhoneDetails());
    }
}