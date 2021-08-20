package com.calltouch.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteSubject implements ISubject {
    private int state;

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        System.out.println("ConcreteSubject::attach");
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        System.out.println("ConcreteSubject::detach");
        observers.remove(observer);
    }

    @Override
    public void announce() {
        System.out.println("ConcreteSubject::announce");
        observers.forEach(x -> x.update(this));
    }

    public void busynessLogic() {
        System.out.println("ConcreteSubject::busynessLogic");
        this.state = new Random().nextInt(100);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ConcreteSubject::busynessLogic state changed to " + this.state);
        announce();
    }

    public int getState() {
        return state;
    }
}
