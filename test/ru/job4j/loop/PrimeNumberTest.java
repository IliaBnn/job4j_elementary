package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNumberTest {

    @Test
    public void whenSeven() {
        int count = PrimeNumber.calc(7);
        assertThat(count, is(4));
    }

    @Test
    public void whenOne() {
        int count = PrimeNumber.calc(1);
        assertThat(count, is(0));
    }

    @Test
    public void whenSix() {
        int count = PrimeNumber.calc(6);
        assertThat(count, is(3));
    }

    @Test
    public void whenTwo() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}