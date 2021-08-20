package com.calltouch.pattern.behavioral.visitor;

public class ConcreteComponent1 implements IComponent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitConcreteComponent1(this);
    }

    public int methodOfConcreteComponent1() {
        return 1;
    }
}
