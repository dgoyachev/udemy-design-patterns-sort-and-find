package com.calltouch.pattern.behavioral.state;

public class ConcreteState2 implements IState {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteState2::handle");
        context.setState(new ConcreteState1());
    }
}
