package com.calltouch.pattern.creational.udemy;

public class Samsung implements IMobile {
    @Override
    public IAndroid getAndroidPhone() {
        return new SamsungGalaxy();
    }

    @Override
    public IiOS getIOSPhone() {
        return new SamsungGuru();
    }
}
