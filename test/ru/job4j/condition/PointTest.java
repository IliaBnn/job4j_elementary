package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void whenX1Y1X2Y2Zero() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1Y1ZeroX2Y2One() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0 ,0);
        Point b = new Point(4, 0,3);
        double expected = 5;
        double out = a.distance3d(b);
        assertThat(out, is(expected));
    }
}