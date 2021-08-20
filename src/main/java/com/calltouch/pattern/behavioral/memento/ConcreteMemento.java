package com.calltouch.pattern.behavioral.memento;

public class ConcreteMemento implements Memento {
    private final long date;
    private final String state;

    public ConcreteMemento(String state) {
        this.date = System.currentTimeMillis();
        this.state = state;
    }

    @Override
    public String getName() {
        return this.date + " / " + this.state;
    }

    @Override
    public long getDate() {
        return this.date;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "ConcreteMemento{" +
                "date=" + date +
                ", state='" + state + '\'' +
                '}';
    }
}
