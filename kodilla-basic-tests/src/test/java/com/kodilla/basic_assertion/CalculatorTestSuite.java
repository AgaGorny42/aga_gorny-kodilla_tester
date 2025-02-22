package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double powResult = calculator.pow(a, b);
        assertEquals(390625, powResult, 0);
    }
    @Test
    public void testPowWithZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 2;
        double powResult = calculator.pow(a, b);
        assertEquals(0.0, powResult, 0);
    }
    @Test
    public void testPowWithNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -1;
        int b = 3;
        double powResult = calculator.pow(a, b);
        assertEquals(-1, powResult, 0);
    }
}
