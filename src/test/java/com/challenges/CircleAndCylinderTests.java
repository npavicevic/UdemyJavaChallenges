package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleAndCylinderTests {
    @Test
    public void circleTest() {
        Circle circle = new Circle(3.75);

        assertEquals(3.75, circle.getRadius());
        assertEquals(44.178646691106465, circle.getArea());

        circle = new Circle(-3.75);

        assertEquals(0.0, circle.getRadius());
        assertEquals(0.0, circle.getArea());
    }

    @Test
    public void cylinderTest() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);

        assertEquals(5.55, cylinder.getRadius());
        assertEquals(7.25, cylinder.getHeight());
        assertEquals(96.76890771219959, cylinder.getArea());
        assertEquals(701.574580913447, cylinder.getVolume());

        cylinder = new Cylinder(5.55, -7.25);

        assertEquals(5.55, cylinder.getRadius());
        assertEquals(0.0, cylinder.getHeight());
        assertEquals(96.76890771219959, cylinder.getArea());
        assertEquals(0.0, cylinder.getVolume());

        cylinder = new Cylinder(-5.55, 7.25);

        assertEquals(0.0, cylinder.getRadius());
        assertEquals(7.25, cylinder.getHeight());
        assertEquals(0.0, cylinder.getArea());
        assertEquals(0.0, cylinder.getVolume());
    }
}
