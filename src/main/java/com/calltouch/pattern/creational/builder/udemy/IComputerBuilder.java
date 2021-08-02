package com.calltouch.pattern.creational.builder.udemy;

public interface IComputerBuilder {
    void setMonitor();
    void setKeyboard();
    void setTower();
    void setMouse();
    void setPrinter();
    Computer getComputer();
}
