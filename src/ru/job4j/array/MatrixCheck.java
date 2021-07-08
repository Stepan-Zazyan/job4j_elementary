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

    public static char[] extractDiagonal(char[][] array) {
        char[] oneLine = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            oneLine[i] = array[i][i];
        }
        return oneLine;
    }

    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                return true;
            }
        }
        return false;
    }
}
