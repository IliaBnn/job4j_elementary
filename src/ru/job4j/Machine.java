package ru.job4j;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        while (money - price > 0) {
            if (money - COINS[j] >= price) {
                rsl[size] = COINS[j];
                money -= COINS[j];
                size++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
