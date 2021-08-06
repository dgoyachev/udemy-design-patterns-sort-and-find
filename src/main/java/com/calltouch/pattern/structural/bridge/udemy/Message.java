package com.calltouch.pattern.structural.bridge.udemy;

public abstract class Message {
    private ISender sender;
    private final String subject;
    private final String body;

    public Message(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public abstract void send();

    public ISender getSender() {
        return sender;
    }

    public void setSender(ISender sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
