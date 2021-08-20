package com.calltouch.pattern.behavioral.visitor;

public class ConcreteComponent2 implements IComponent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitConcreteComponent2(this);
    }

    public int methodOfConcreteComponent2() {
        return 2;
    }
}
