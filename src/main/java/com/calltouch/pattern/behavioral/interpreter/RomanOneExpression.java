package com.calltouch.pattern.behavioral.interpreter;

public class RomanOneExpression extends Expression {
    @Override
    void interpret(RomanNumerals baseTenNumber) {
        while (baseTenNumber.getInput() - 9 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "IX");
            baseTenNumber.setInput(baseTenNumber.getInput() - 9);
        }

        while (baseTenNumber.getInput() - 5 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "V");
            baseTenNumber.setInput(baseTenNumber.getInput() - 5);
        }

        while (baseTenNumber.getInput() - 4 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "IV");
            baseTenNumber.setInput(baseTenNumber.getInput() - 4);
        }

        while (baseTenNumber.getInput() - 3 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "III");
            baseTenNumber.setInput(baseTenNumber.getInput() - 3);
        }

        while (baseTenNumber.getInput() - 2 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "II");
            baseTenNumber.setInput(baseTenNumber.getInput() - 2);
        }

        while (baseTenNumber.getInput() - 1 >= 0 ) {
            baseTenNumber.setOutput(baseTenNumber.getOutput() + "I");
            baseTenNumber.setInput(baseTenNumber.getInput() - 1);
        }
    }
}
