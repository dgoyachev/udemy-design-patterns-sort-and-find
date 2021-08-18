package com.calltouch.pattern.behavioral.chainofresponsibility;

public abstract class HandlerBase {
    private final HandlerBase next;
    private final ContextObject question;

    public HandlerBase(HandlerBase next, ContextObject question) {
        this.next = next;
        this.question = question;
    }

    public abstract void handleRequest();

    public HandlerBase getNext() {
        return next;
    }

    public ContextObject getQuestion() {
        return question;
    }
}
