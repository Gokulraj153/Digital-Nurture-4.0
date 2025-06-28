package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    DummyService service = new DummyService();

    @Test
    public void testAssertEquals() {
        int result = service.getSum();
        System.out.println("Assert Equals: 2 + 3 = " + result);
        assertEquals(5, result);
    }

    @Test
    public void testAssertTrue() {
        System.out.println("Assert True: 5 is positive");
        assertTrue(service.isPositive(5));
    }

    @Test
    public void testAssertFalse() {
        System.out.println("Assert False: -3 is not positive");
        assertFalse(service.isPositive(-3));
    }

    @Test
    public void testAssertNull() {
        System.out.println("Assert Null: getNullObject should return null");
        assertNull(service.getNullObject());
    }

    @Test
    public void testAssertNotNull() {
        System.out.println("Assert Not Null: getNonNullObject should return non-null");
        assertNotNull(service.getNonNullObject());
    }
}
