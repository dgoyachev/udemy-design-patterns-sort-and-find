package com.calltouch.pattern.behavioral.observer;

public class ConcreteObserver1 implements IObserver {
    @Override
    public void update(ISubject subject) {
        if(((ConcreteSubject) subject).getState() < 50) {
            System.out.println("ConcreteObserver1::update reached the event");
        }
    }
}
