package com.calltouch.pattern.structural.bridge.udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISenderTest {

    @Test
    public void bridgeTest() {
        ISender facebookSender = new FacebookSender();
        ISender twitterSender = new TwitterSender();
        ISender instagramSender = new InstagramSender();

        Message systemMessage = new SystemMessage("Test Message", "Hello world");

        systemMessage.setSender(facebookSender);
        systemMessage.send();

        systemMessage.setSender(twitterSender);
        systemMessage.send();

        systemMessage.setSender(instagramSender);
        systemMessage.send();

        Message userMessage = new UserMessage("Test Message", "Hello World", "Hi!");
        userMessage.setSender(facebookSender);
        userMessage.send();
    }

}