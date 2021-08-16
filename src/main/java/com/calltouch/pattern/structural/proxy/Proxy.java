package com.calltouch.pattern.structural.proxy;

public class Proxy {
    private IInformation secretInfo;

    public int GetSecretInfo(boolean hasClearance) {
        if(hasClearance) {
            secretInfo = new SecretInformation();
            return secretInfo.getInformation();
        }

        return -1;
    }
}
