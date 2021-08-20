package com.calltouch.pattern.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteSubjectTest {
    @Test
    public void observerTest() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        subject.attach(observer1);
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        subject.attach(observer2);

        subject.busynessLogic();
        subject.busynessLogic();
        subject.busynessLogic();

        subject.detach(observer2);

        subject.busynessLogic();
    }
}