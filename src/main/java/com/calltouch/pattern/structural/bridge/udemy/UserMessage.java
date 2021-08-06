package com.calltouch.pattern.structural.bridge.udemy;

public class UserMessage extends Message {

    private final String userComments;

    public UserMessage(String subject, String body, String userComments) {
        super(subject, body);
        this.userComments = userComments;
    }

    @Override
    public void send() {
        String fullBody = getBody() + " - User comments: " + userComments;
        getSender().sendMessage(getSubject(), fullBody);
    }

    public String getUserComments() {
        return userComments;
    }
}
