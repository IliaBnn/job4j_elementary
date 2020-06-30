package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then2() {
        int value = 5;
        int[] input = new int[]{1, 2, 5, 6, 10, 2};
        int rst = FindLoop.indexOf(input, value);
        int expected = 2;
        assertThat(rst, is(expected));
    }

    @Test
    public void whenArrayDontHas4ThenMinus1() {
        int value = 4;
        int[] input = new int[]{1, 3, 5, 0, 20, 6};
        int rst = FindLoop.indexOf(input, value);
        int expected = -1;
        assertThat(rst, is(expected));
    }
}