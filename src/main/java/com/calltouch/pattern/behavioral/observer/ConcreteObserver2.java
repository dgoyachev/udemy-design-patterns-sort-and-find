package com.calltouch.pattern.behavioral.observer;

public class ConcreteObserver2 implements IObserver {
    @Override
    public void update(ISubject subject) {
        if(((ConcreteSubject) subject).getState() >= 50) {
            System.out.println("ConcreteObserver2::update reached the event");
        }
    }
}
