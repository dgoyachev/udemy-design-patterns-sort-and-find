package com.calltouch.pattern.behavioral.mediator;

public class Friend {

    private IMediator mediator;

    public IMediator getMediator() {
        return mediator;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}
