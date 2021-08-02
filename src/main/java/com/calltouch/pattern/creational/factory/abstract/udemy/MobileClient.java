package com.calltouch.pattern.creational.udemy;

public class MobileClient {
    IAndroid androidPhone;
    IiOS iOSPhone;

    public MobileClient(IMobile factory) {
        androidPhone = factory.getAndroidPhone();
        iOSPhone = factory.getIOSPhone();
    }

    public String getAndroidPhoneDetails() {
        return androidPhone.getModelDetails();
    }

    public String getIOSPhoneDetails() {
        return iOSPhone.getModelDetails();
    }
}
