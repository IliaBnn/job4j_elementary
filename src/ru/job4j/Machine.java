package ru.job4j;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < COINS.length; i++) {
            while (money - COINS[i] >= price) {
                rsl[size] = COINS[i];
                money -= COINS[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine m = new Machine();
        int[] array = m.change(50, 35);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
