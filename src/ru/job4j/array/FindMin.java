package ru.job4j.array;

public class FindMin {

    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min < data[i]) {
                min = data[i];
            }
        }

        return min;
    }
}
