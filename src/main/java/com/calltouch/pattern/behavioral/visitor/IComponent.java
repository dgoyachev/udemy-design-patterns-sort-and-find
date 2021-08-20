package com.calltouch.pattern.behavioral.visitor;

public interface IComponent {
    void accept(IVisitor visitor);
}
