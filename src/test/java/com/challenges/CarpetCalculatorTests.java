package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarpetCalculatorTests {

    @Test
    public void getTotalCostTest() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        assertEquals(38.5, calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        assertEquals(36.45, calculator.getTotalCost());

        carpet = new Carpet(-1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        assertEquals(0.0, calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(-5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        assertEquals(0.0, calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, -4.5);
        calculator = new Calculator(floor, carpet);
        assertEquals(0.0, calculator.getTotalCost());
    }
}
