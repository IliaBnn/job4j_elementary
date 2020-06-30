package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(false));
    }
}