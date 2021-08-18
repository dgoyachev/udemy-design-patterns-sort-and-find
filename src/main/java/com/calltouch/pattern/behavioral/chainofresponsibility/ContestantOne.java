package com.calltouch.pattern.behavioral.chainofresponsibility;

public class ContestantOne extends HandlerBase {
    public ContestantOne(HandlerBase next, ContextObject question) {
        super(next, question);
    }

    @Override
    public void handleRequest() {
        System.out.println("Question: " + getQuestion());
        System.out.println("--------------------------");
        System.out.println("Waiting for contestant one to respond ...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t no response from contestant one.");
        if(getNext() != null) {
            getNext().handleRequest();
        }
    }
}
