package ru.job4j.loop;

public class Factorial {

    public static int factorial(int num) {
        int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
}

