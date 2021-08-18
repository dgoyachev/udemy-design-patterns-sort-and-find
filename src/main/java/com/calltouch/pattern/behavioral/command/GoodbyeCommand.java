package com.calltouch.pattern.behavioral.command;

public class GoodbyeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("I am executing Goodbye command");
    }

    @Override
    public String getName() {
        return "Goodbye";
    }
}
