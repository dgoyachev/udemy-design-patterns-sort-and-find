package com.calltouch.pattern.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteMediatorTest {

    @Test
    public void sendMessageTest() {
        AngryFriend1 angryFriend1 = new AngryFriend1();
        AngryFriend2 angryFriend2 = new AngryFriend2();

        ConcreteMediator concreteMediator = new ConcreteMediator(angryFriend1, angryFriend2);
        angryFriend1.send("Hi!");
        angryFriend2.send("How are you?");
    }
}