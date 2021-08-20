package com.calltouch.pattern.behavioral.observer;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void announce();
}
