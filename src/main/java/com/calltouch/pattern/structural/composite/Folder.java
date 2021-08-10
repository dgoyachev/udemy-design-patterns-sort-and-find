package com.calltouch.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private final String value;
    private final List<Component> list = new ArrayList<>();

    public Folder(String value) {
        this.value = value;
    }

    @Override
    public void addChild(Component c) {
        this.list.add(c);
    }

    @Override
    public void traverse() {
        System.out.println("Folder: " + this.value);
        for(Component c : this.list) {
            c.traverse();
        }
    }

    public String getValue() {
        return value;
    }
}
