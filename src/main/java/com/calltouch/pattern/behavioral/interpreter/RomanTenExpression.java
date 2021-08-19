package com.calltouch.pattern.behavioral.interpreter;

public class RomanTenExpression extends Expression {
    @Override
    void interpret(RomanNumerals baseTenNumber) {
        while (baseTenNumber.getInput() - 90 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "XC");
            baseTenNumber.setInput(baseTenNumber.getInput() - 90);
        }

        while (baseTenNumber.getInput() - 50 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "L");
            baseTenNumber.setInput(baseTenNumber.getInput() - 50);
        }

        while (baseTenNumber.getInput() - 40 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "XL");
            baseTenNumber.setInput(baseTenNumber.getInput() - 40);
        }

        while (baseTenNumber.getInput() - 30 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "XXX");
            baseTenNumber.setInput(baseTenNumber.getInput() - 30);
        }

        while (baseTenNumber.getInput() - 20 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "XX");
            baseTenNumber.setInput(baseTenNumber.getInput() - 20);
        }

        while (baseTenNumber.getInput() - 10 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "X");
            baseTenNumber.setInput(baseTenNumber.getInput() - 10);
        }
    }
}
