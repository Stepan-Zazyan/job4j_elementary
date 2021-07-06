package ru.job4j.loop;

public class Mortrage {

    public static int year(double amount, double salary, double percent) {
        int count = 0;
        while (amount > 0) {
            amount = amount + (amount * percent / 100) - salary;
            count += 1;
        }
        return count;
    }
}
