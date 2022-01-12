package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return y + x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        Calculator num = new Calculator();
        System.out.println(sum(5) + " " + minus(5) + " " + num.divide(5) + " " + num.multiply(5) + " " + num.sumAllOperation(5));
    }
}
