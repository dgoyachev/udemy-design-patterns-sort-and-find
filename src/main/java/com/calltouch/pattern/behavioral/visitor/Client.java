package com.calltouch.pattern.behavioral.visitor;

import java.util.List;

public class Client {
    public static void clientCode(List<IComponent> componentList, IVisitor visitor) {
        componentList.forEach(x -> x.accept(visitor));
    }
}
