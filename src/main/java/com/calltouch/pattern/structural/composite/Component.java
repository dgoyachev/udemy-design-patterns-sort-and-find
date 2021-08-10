package com.calltouch.pattern.structural.composite;

public abstract class Component {
    public abstract void addChild(Component c);
    public abstract void traverse();
}
