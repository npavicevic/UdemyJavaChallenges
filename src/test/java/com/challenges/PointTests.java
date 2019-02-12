package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PointTests {

    @Test
    public void distanceTests() {
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);

        assertEquals(7.810249675906654, point1.distance());
        assertEquals(5.0, point1.distance(point2));
        assertEquals(5.0, point1.distance(2, 2));

        Point point3 = new Point();
        assertEquals(0.0, point3.distance());
    }
}
