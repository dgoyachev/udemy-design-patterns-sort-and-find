package com.calltouch.pattern.creational.builder.udemy;

public class ComputerBBuilder implements IComputerBuilder {

    private static Computer computer = null;

    private String monitor;
    private String keyboard;
    private String tower;
    private String mouse;
    private String printer;

    @Override
    public void setMonitor() {
        this.monitor = "Monitor 2";
    }

    @Override
    public void setKeyboard() {
        this.keyboard = "Keyboard 2";
    }

    @Override
    public void setTower() {
        this.tower = "Tower 2";
    }

    @Override
    public void setMouse() {
        this.mouse = "Mouse 2";
    }

    @Override
    public void setPrinter() {
        this.printer = "Printer 2";
    }

    @Override
    public Computer getComputer() {
        if(computer == null) {
            computer = new Computer(this.monitor, this.keyboard, this.tower, this.mouse, this.printer);
        }
        return computer;
    }
}
