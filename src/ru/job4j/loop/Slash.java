package ru.job4j.loop;

public class Slash {

    public static  void slash(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        slash(3);
        System.out.println("Draw by 5");
        slash(5);
    }
}
