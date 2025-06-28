package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        System.out.println("Add: 10 + 5 = " + result);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 5);
        System.out.println("Subtract: 10 - 5 = " + result);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(10, 5);
        System.out.println("Multiply: 10 * 5 = " + result);
        assertEquals(50, result);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 5);
        System.out.println("Divide: 10 / 5 = " + result);
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(10, 0);
    }
}
