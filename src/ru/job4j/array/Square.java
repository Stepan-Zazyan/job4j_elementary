package ru.job4j.array;

public class Square {

    public static int[] calc(int bound) {
        int[] array = new int[bound];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
            return array;
    }

    public static void main(String[] args) {
        int[] testArray = calc(4);
        for (int j : testArray) {
            System.out.println(j);
        }

    }
}
