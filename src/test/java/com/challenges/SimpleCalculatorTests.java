package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTests {
    @Test
    public void getAdditionResultTest() {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(12.3);
        sc.setSecondNumber(45.6);
        assertEquals(57.900000000000006, sc.getAdditionResult());
    }

    @Test
    public void getSubtractionResultTest() {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(12.3);
        sc.setSecondNumber(45.6);
        assertEquals(-33.3, sc.getSubtractionResult());
    }

    @Test
    public void getMultiplicationResultTest() {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(12.3);
        sc.setSecondNumber(45.6);
        assertEquals(560.88, sc.getMultiplicationResult());
    }

    @Test
    public void getDivisionResultTest() {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(12.3);
        sc.setSecondNumber(45.6);
        assertEquals(0.26973684210526316, sc.getDivisionResult());
    }
}
