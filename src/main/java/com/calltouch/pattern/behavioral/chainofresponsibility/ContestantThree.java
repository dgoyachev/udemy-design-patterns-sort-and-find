package com.calltouch.pattern.behavioral.chainofresponsibility;

public class ContestantThree extends HandlerBase{
    public ContestantThree(HandlerBase next, ContextObject question) {
        super(next, question);
    }

    @Override
    public void handleRequest() {
        System.out.println("Waiting to contestant three to respond .. ");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t no response from contestant three as well ...");
        if(getNext() != null) {
            getNext().handleRequest();
        }
    }
}
