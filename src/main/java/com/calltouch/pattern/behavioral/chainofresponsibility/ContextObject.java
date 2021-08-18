package com.calltouch.pattern.behavioral.chainofresponsibility;

public class ContextObject {
    private final String question;

    public ContextObject(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
