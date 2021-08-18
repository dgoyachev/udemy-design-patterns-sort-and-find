package com.calltouch.pattern.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlerBaseTest {
    @Test
    public void handlerTest() {
        ContextObject question = new ContextObject("Who won?");
        ContestantThree three = new ContestantThree(null, question);
        ContestantTwo two = new ContestantTwo(three, question);
        ContestantOne one = new ContestantOne(two,question);
        one.handleRequest();
    }
}