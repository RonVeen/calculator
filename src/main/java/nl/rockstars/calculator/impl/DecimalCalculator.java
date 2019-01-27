package nl.rockstars.calculator.impl;

import nl.rockstars.calculator.Calculator;

public class DecimalCalculator implements Calculator {
    public long add(long a, long b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long divide(long a, long b) {
        return a /b;
    }
}
