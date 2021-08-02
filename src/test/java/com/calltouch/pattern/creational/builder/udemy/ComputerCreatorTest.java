package com.calltouch.pattern.creational.builder.udemy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerCreatorTest {

    @Test
    public void computerCreatorTest() {
        ComputerCreator computerCreator = new ComputerCreator(new ComputerABuilder());
        Computer computer = computerCreator.createComputer();
        assertEquals("Mouse 1", computer.getMouse());
        assertEquals("Keyboard 1", computer.getKeyboard());
        assertEquals("Tower 1", computer.getTower());
        assertEquals("Printer 1", computer.getPrinter());
        assertEquals("Monitor 1", computer.getMonitor());

        computerCreator = new ComputerCreator(new ComputerBBuilder());
        computer = computerCreator.createComputer();
        assertEquals("Mouse 2", computer.getMouse());
        assertEquals("Keyboard 2", computer.getKeyboard());
        assertEquals("Tower 2", computer.getTower());
        assertEquals("Printer 2", computer.getPrinter());
        assertEquals("Monitor 2", computer.getMonitor());
    }
}