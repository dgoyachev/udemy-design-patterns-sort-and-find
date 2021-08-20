package com.calltouch.pattern.behavioral.strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConcreteStrategyB implements IStrategy {
    @Override
    public List<Integer> doAlgorithm(Object data) {
        return ((List<Integer>) data).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
