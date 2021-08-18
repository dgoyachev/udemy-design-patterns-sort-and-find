package com.calltouch.pattern.behavioral.chainofresponsibility;

public class ContestantTwo extends HandlerBase{
    public ContestantTwo(HandlerBase next, ContextObject question) {
        super(next, question);
    }

    @Override
    public void handleRequest() {
        System.out.println("Waiting to contestant two to respond .. ");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t no response from contestant two.");
        if(getNext() != null) {
            getNext().handleRequest();
        }
    }
}
