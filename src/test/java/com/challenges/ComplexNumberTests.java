package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComplexNumberTests {
    @Test
    public void addTest() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);
        assertEquals(2.0, one.getReal());
        assertEquals(2.0, one.getImaginary());

        one.add(number);
        assertEquals(4.5, one.getReal());
        assertEquals(0.5, one.getImaginary());
    }

    @Test
    public void subtractTest() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.subtract(number);
        assertEquals(-1.5, one.getReal());
        assertEquals(2.5, one.getImaginary());

        number.subtract(one);
        assertEquals(4.0, number.getReal());
        assertEquals(-4.0, number.getImaginary());

        one = new ComplexNumber(1.0, 1.0);
        one.subtract(2.5, -1.5);
        assertEquals(-1.5, one.getReal());
        assertEquals(2.5, one.getImaginary());

        number = new ComplexNumber(2.5, -1.5);
        number.subtract(1.0, 1.0);
        assertEquals(1.5, number.getReal());
        assertEquals(-2.5, number.getImaginary());
    }
}
