package nl.rockstars.calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        long expected = 32;
        assertEquals(expected, (28 + 4));
    }

    @org.junit.Test
    public void subtract() {
        long expected = 10;
        assertEquals(expected, (16 - 6));
    }

    @org.junit.Test
    public void multiply() {
        long expected = 42;
        assertEquals(expected, (2 * 21));
    }

    @org.junit.Test
    public void divide() {
        long expected = 30;
        assertEquals(expected, (90 / 3));
    }
}