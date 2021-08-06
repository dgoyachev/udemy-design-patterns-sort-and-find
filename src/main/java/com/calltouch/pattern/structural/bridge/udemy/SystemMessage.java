package com.calltouch.pattern.structural.bridge.udemy;

public class SystemMessage extends Message {
    public SystemMessage(String subject, String body) {
        super(subject, body);
    }

    @Override
    public void send() {
        getSender().sendMessage(getSubject(), getBody());
    }
}
