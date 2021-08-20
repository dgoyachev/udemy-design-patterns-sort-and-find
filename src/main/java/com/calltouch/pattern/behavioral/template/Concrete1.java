package com.calltouch.pattern.behavioral.template;

public class Concrete1 extends Base {
    @Override
    public void requiredOperation1() {
        System.out.println("Concrete1::requiredOperation1");
    }

    @Override
    public void requiredOperation2() {
        System.out.println("Concrete1::requiredOperation2");
    }
}
