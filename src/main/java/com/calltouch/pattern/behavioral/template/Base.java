package com.calltouch.pattern.behavioral.template;

public abstract class Base {
    public void templateMethod() {
        operation1();
        requiredOperation1();
        operation2();
        hook2();
        operation3();
        hook1();
        requiredOperation2();
    }
    public void operation1() {
        System.out.println("Base::operation1");
    }
    public void operation2() {
        System.out.println("Base::operation2");
    }
    public void operation3() {
        System.out.println("Base::operation3");
    }
    public void requiredOperation1() {
        System.out.println("Base::requiredOperation1");
    }
    public void requiredOperation2() {
        System.out.println("Base::requiredOperation2");
    }
    public void hook1() {
        System.out.println("Base::hook1");
    }
    public void hook2() {
        System.out.println("Base::hook2");
    }
}
