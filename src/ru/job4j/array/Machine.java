package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int count = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
                while   (change >= coins[i]) {
                        change -= coins[i];
                        size += 1;
                        rsl[i + count] = coins[i];
                        count += 1;
                }
                count -= 1;
            }
        return Arrays.copyOf(rsl, size);
    }
}
