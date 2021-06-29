package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int y1, int x2, int y2) {
        int x = x2-x1;
        int y = y2-y1;
        x *= x;
        y *= y;
        int sum = x+y;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(5,4,3,2);
        System.out.println(result);
    }
}
