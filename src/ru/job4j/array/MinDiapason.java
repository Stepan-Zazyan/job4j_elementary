package ru.job4j.array;

public class MinDiapason {

   public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (array[i + 1] < array[i]) {
                min = array[i + 1];
            }
        }
        return min;
    }
}
