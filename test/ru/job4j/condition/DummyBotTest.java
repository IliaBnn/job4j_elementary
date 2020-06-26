package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnkownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2+2, Бот?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}