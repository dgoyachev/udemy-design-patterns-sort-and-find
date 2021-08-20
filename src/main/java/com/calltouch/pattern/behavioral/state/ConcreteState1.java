package com.calltouch.pattern.behavioral.state;

public class ConcreteState1 implements IState {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteState1::handle");
        context.setState(new ConcreteState2());
    }
}
