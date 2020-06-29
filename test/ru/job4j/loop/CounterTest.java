package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvennumbersFromFiveToTwelveThenThirtySix() {
        int rsl = Counter.sumByEven(5, 12);
        int expected = 36;
        assertThat(rsl, is(expected));
    }
}