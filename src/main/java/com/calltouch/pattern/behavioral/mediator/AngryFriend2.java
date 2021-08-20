package com.calltouch.pattern.behavioral.mediator;

public class AngryFriend2 extends Friend {

    public void send(String msg) {
        System.out.println("Friend2 sends message " + msg);
        getMediator().sendMessage(this, msg);
    }

    public void receive(String msg) {
        System.out.println("Friend2 receives message: " + msg);
    }
}
