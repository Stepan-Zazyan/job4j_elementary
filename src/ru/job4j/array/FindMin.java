package ru.job4j.array;

public class FindMin {

    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i + 1] < data[i]) {
                min = data[i + 1];
            }
        }

        return min;
    }
}
