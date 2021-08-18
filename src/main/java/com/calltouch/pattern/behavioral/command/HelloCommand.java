package com.calltouch.pattern.behavioral.command;

public class HelloCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("I am executing Hello command");
    }

    @Override
    public String getName() {
        return "Hello";
    }
}
