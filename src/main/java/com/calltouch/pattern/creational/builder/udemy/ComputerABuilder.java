package com.calltouch.pattern.creational.builder.udemy;

public class ComputerABuilder implements IComputerBuilder {

    private static Computer computer = null;

    private String monitor;
    private String keyboard;
    private String tower;
    private String mouse;
    private String printer;

    @Override
    public void setMonitor() {
        this.monitor = "Monitor 1";
    }

    @Override
    public void setKeyboard() {
        this.keyboard = "Keyboard 1";
    }

    @Override
    public void setTower() {
        this.tower = "Tower 1";
    }

    @Override
    public void setMouse() {
        this.mouse = "Mouse 1";
    }

    @Override
    public void setPrinter() {
        this.printer = "Printer 1";
    }

    @Override
    public Computer getComputer() {
        if(computer == null) {
            computer = new Computer(this.monitor, this.keyboard, this.tower, this.mouse, this.printer);
        }
        return computer;
    }
}
