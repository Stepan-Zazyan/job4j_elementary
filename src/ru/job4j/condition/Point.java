package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point those) {
        return sqrt(pow(this.x - those.x, 2) + pow(this.y - those.y, 2) + pow(this.z - those.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

   public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 1, 5);
        Point d = new Point(1, 2, 3);
        double dist = a.distance(b);
        System.out.println(dist);
        double dist3d = c.distance3d(d);
        System.out.println(dist3d);
    }
}
