package com.calltouch.pattern.structural.bridge.udemy;

public class TwitterSender implements ISender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Twitter - " + subject + " - " + body);
    }
}
