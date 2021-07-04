package ru.job4j.condition;
public class ChessBoard {

    public static boolean isPositiveAndLessSeven(int num) {
        return num > 0 && num < 8;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if ((x2 - x1 == y2 - y1) && (isPositiveAndLessSeven(x1) && isPositiveAndLessSeven(x2) && isPositiveAndLessSeven(y1) && isPositiveAndLessSeven(y2))) {
            result = Math.abs(x2 - x1);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(way(7, 3, 5, 1));
    }
}
