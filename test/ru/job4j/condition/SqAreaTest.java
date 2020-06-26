package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenK1P8() {
        int p = 8;
        int k = 1;
        double expected = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenK2P10() {
        int p = 10;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}