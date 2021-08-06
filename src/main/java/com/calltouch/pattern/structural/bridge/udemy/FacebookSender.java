package com.calltouch.pattern.structural.bridge.udemy;

public class FacebookSender implements ISender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Facebook - " + subject + " - " + body);
    }
}
