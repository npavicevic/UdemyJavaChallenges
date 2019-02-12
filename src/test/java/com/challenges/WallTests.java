package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WallTests {

    @Test
    public void getAreaTest() {
        Wall wall = new Wall();

        wall.setHeight(5);
        wall.setWidth(6);
        assertEquals(30.0, wall.getArea());

        wall.setHeight(-1);
        wall.setWidth(6);
        assertEquals(0.0, wall.getArea());

        wall.setHeight(5);
        wall.setWidth(-1);
        assertEquals(0.0, wall.getArea());
    }

    @Test
    public void wallConstructorTest() {
        Wall wall = new Wall(5, 6);
        assertEquals(30.0, wall.getArea());

        Wall wall1 = new Wall(-1, 6);
        assertEquals(0.0, wall1.getArea());

        Wall wall2 = new Wall(5, -1);
        assertEquals(0.0, wall2.getArea());
    }
}
