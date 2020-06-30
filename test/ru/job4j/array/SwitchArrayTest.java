package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SwitchArrayTest {

    @Test
    public void whenSwitch1and2() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{1, 3, 2, 4, 5};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSwitch0and3() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{4, 2, 3, 1, 5};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expected));
    }
}