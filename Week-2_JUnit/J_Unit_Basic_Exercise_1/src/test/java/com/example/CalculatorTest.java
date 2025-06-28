package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddWithOutput() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 2);
        System.out.println("Testing add(3, 2): Expected = 5, Actual = " + result);
        assertEquals(5, result);
    }
}
