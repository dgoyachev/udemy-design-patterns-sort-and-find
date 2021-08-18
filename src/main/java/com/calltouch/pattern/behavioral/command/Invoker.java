package com.calltouch.pattern.behavioral.command;

public class Invoker {
    private ICommand command;

    public ICommand getCommand(String action) {
        switch (action) {
            case "Hello":
                command = new HelloCommand();
                break;
            case "Goodbye":
                command = new GoodbyeCommand();
                break;
        }
        return command;
    }
}
