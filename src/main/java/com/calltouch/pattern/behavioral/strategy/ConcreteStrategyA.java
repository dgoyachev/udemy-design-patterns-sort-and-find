package com.calltouch.pattern.behavioral.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class ConcreteStrategyA implements IStrategy {
    @Override
    public List<Integer> doAlgorithm(Object data) {
        return ((List<Integer>) data).stream().sorted().collect(Collectors.toList());
    }
}
