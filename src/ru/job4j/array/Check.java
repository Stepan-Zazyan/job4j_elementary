package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] array) {
        boolean rsl = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}
