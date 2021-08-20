package com.calltouch.pattern.behavioral.mediator;

public class ConcreteMediator implements IMediator {

    private final AngryFriend1 angryFriend1;
    private final AngryFriend2 angryFriend2;

    public ConcreteMediator(AngryFriend1 angryFriend1, AngryFriend2 angryFriend2) {
        this.angryFriend1 = angryFriend1;
        this.angryFriend2 = angryFriend2;

        angryFriend1.setMediator(this);
        angryFriend2.setMediator(this);
    }

    @Override
    public void sendMessage(Friend caller, String msg) {
        if(caller instanceof AngryFriend1) {
            angryFriend2.receive(msg);
        }
        else  {
            angryFriend1.receive(msg);
        }
    }
}
