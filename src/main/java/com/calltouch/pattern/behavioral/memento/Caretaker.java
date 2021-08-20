package com.calltouch.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos;
    private Originator originator;

    public Caretaker(Originator originator) {
        this.mementos = new ArrayList<>();
        this.originator = originator;
    }

    public void backup() {
        System.out.println("Caretaker::backup originator state");
        mementos.add(originator.save());
    }

    public void undo() {
        if(mementos == null || mementos.isEmpty()) {
            return;
        }

        var memento = mementos.remove(mementos.size() - 1);
        System.out.println("Caretaker::undo restore state to " + memento.getName());

        try {
            originator.restore(memento);
        }
        catch (Exception e) {
            this.undo();
        }
    }

    public void showHistory() {
        System.out.println("Caretaker::showHistory");
        mementos.forEach(System.out::println);

    }
}
