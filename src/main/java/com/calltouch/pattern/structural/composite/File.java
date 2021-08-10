package com.calltouch.pattern.structural.composite;

public class File extends Component {

    private final String value;

    public File(String value) {
        this.value = value;
    }

    @Override
    public void addChild(Component c) {}

    @Override
    public void traverse() {
        System.out.println("File: " + this.value);
    }

    public String getValue() {
        return value;
    }
}
