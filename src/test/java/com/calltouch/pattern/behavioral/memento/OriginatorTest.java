package com.calltouch.pattern.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginatorTest {

    @Test
    public void mementoTest() {
        Originator originator = new Originator("Initial state");
        Caretaker caretaker = new Caretaker(originator);

        caretaker.backup();
        originator.performAction(1);
        caretaker.backup();
        originator.performAction(2);
        caretaker.backup();
        originator.performAction(3);

        caretaker.showHistory();
        System.out.println("Performing undo");
        caretaker.undo();
        caretaker.showHistory();
    }
}