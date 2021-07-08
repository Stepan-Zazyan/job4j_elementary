package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int row) {
        for (int i = 0; i < array.length; i++) {
                if (array[row][i] != 'X') {
                    return false;
                }
            }
        return true;
    }

    public static boolean monoVertical(char[][] array, int column) {
        for (int i = 0; i < array.length; i++) {
            if ('X' != array[i][column]) {
                return false;
            }
        }
        return true;
    }
}
