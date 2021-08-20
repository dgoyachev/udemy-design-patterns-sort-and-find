package com.calltouch.pattern.behavioral.strategy;

import java.util.List;

public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doLogic() {
        System.out.println(strategy.doAlgorithm(List.of(1,3,2,5,4)));
    }
}
