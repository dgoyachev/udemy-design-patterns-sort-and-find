package com.calltouch.pattern.behavioral.mediator;

public class AngryFriend1 extends Friend {

    public void send(String msg) {
        System.out.println("Friend1 sends message " + msg);
        getMediator().sendMessage(this, msg);
    }

    public void receive(String msg) {
        System.out.println("Friend1 receives message: " + msg);
    }
}
