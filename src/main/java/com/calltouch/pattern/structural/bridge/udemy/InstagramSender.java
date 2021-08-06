package com.calltouch.pattern.structural.bridge.udemy;

public class InstagramSender implements ISender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Instagram - " + subject + " - " + body);
    }
}
