package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * 2 + 3;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
