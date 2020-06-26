package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight187() {
        short in = 187;
        double expected = 100.04;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight187() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}