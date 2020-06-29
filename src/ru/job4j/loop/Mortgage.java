package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double sum = amount;
        percent = percent / 100;
        while (sum > 0) {
            sum = sum + percent * sum - salary;
            year++;
        }
        return year;
    }
}
