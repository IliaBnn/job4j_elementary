package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MortgageTest {

    @Test
    public void whenOneYear() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void whenTwoYear() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    public void when1Year() {
        int year = Mortgage.year(100, 150, 50);
        assertThat(year, is(1));
    }

    @Test
    public void whenFourYear() {
        int year = Mortgage.year(100, 70, 50);
        assertThat(year, is(4));
    }
}