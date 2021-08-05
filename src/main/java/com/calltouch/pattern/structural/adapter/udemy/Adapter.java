package com.calltouch.pattern.structural.adapter.udemy;

public class Adapter implements ITarget {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return "This is " + adaptee.getRequest();
    }
}
