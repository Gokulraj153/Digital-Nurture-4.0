package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Arrange
    }


    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    @Test
    public void testAdd() {

        int result = calculator.add(10, 5);


        System.out.println("Add(10, 5): " + result);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        System.out.println("Subtract(10, 4): " + result);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 4);
        System.out.println("Multiply(3, 4): " + result);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(20, 5);
        System.out.println("Divide(20, 5): " + result);
        assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
