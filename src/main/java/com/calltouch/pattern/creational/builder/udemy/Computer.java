package com.calltouch.pattern.creational.builder.udemy;

public class Computer {

    private final String monitor;
    private final String keyboard;
    private final String tower;
    private final String mouse;
    private final String printer;

    public Computer(String monitor, String keyboard, String tower, String mouse, String printer) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.tower = tower;
        this.mouse = mouse;
        this.printer = printer;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getTower() {
        return tower;
    }

    public String getMouse() {
        return mouse;
    }

    public String getPrinter() {
        return printer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", tower='" + tower + '\'' +
                ", mouse='" + mouse + '\'' +
                ", printer='" + printer + '\'' +
                '}';
    }
}
