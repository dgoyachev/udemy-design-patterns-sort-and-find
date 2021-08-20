package com.calltouch.pattern.behavioral.visitor;

public class ConcreteVisitor1 implements IVisitor {
    @Override
    public void visitConcreteComponent1(ConcreteComponent1 concreteComponent1) {
        System.out.println(concreteComponent1.methodOfConcreteComponent1() + " ConcreteVisitor1");
    }

    @Override
    public void visitConcreteComponent2(ConcreteComponent2 concreteComponent2) {
        System.out.println(concreteComponent2.methodOfConcreteComponent2() + " ConcreteVisitor1");
    }
}
