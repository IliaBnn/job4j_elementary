package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenLeftBigger() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenRightBigger() {
        int result = Max.max(4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenRightEqualLeft() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void maxThird() {
        int rsl = Max.max(1, 2, 3);
        assertThat(rsl, is(3));
    }

    @Test
    public void maxFourth() {
        int rsl = Max.max(1, 4, 2, 0);
    }
}