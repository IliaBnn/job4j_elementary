package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class machineTest {

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when76by40() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 5, 1};
        int[] rsl = machine.change(76, 40);
        assertThat(rsl, is(expected));
    }
}