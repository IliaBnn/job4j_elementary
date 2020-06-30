package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[] {1, 14, 20}), is(1));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[] {10, 6, 0}), is(0));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[] {10, 1, 9}), is(1));
    }
}