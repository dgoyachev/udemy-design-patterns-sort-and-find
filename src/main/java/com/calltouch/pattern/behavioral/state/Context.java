package com.calltouch.pattern.behavioral.state;

public class Context {
    private IState state;

    public Context(IState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
