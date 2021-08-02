package com.calltouch.pattern.creational.builder.udemy;

public class ComputerCreator {
    private IComputerBuilder computerBuilder;

    public ComputerCreator(IComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer createComputer() {
        computerBuilder.setKeyboard();
        computerBuilder.setMonitor();
        computerBuilder.setMouse();
        computerBuilder.setTower();
        computerBuilder.setPrinter();
        return computerBuilder.getComputer();
    }
}
