package com.calltouch.pattern.behavioral.memento;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
        System.out.println("State: " + this.state);
    }

    public void performAction(int num) {
        System.out.println("Originator::performAction");
        this.state = Integer.toString(num);
        System.out.println("Originator::performAction state changed to " + getState());
    }

    public Memento save() {
        return new ConcreteMemento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
        System.out.println("Originator::restore state to " + this.state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
