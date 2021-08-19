package com.calltouch.pattern.behavioral.interpreter;

public class RomanNumerals {
    private int input;
    private String output;

    public RomanNumerals(int input) {
        this.input = input;
        this.output = "";
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
