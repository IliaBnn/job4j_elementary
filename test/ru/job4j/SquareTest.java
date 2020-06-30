package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(rst, is(expected));
    }
}