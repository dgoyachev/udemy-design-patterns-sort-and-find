package com.calltouch.pattern.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void interpret() {
        Expression[] expressions = new Expression[] {
                new RomanTenExpression(),
                new RomanOneExpression()
        };

        RomanNumerals context = new RomanNumerals(56);
        for(Expression expression : expressions) {
            expression.interpret(context);
        }
        assertEquals("LVI",context.getOutput());
    }
}