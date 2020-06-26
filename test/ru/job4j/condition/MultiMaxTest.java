package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 6, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}