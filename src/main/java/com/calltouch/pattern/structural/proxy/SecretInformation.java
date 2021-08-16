package com.calltouch.pattern.structural.proxy;

import java.util.Random;

public class SecretInformation implements IInformation{
    @Override
    public int getInformation() {
        return new Random().nextInt(99999);
    }
}
