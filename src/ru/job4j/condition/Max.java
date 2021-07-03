package ru.job4j.condition;

public class Max {

        public static int max(int first, int second) {
            return first > second ? first : second;
        }

    public static void main(String[] args) {
        System.out.println(max(10, 1));
    }

}
