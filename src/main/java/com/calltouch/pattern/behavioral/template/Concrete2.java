package com.calltouch.pattern.behavioral.template;

public class Concrete2 extends Base {
    @Override
    public void requiredOperation1() {
        System.out.println("Concrete2::requiredOperation1");
    }

    @Override
    public void requiredOperation2() {
        System.out.println("Concrete2::requiredOperation2");
    }

    @Override
    public void hook1() {
        System.out.println("Concrete2::hook1");
    }
}
