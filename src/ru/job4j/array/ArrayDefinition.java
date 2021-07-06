package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
    String[] names = new String[4];
    names[0] = "Kolya";
    names[1] = "Vitya";
    names[2] = "Darya";
    names[3] = "Katya";
        System.out.println(names[0] + " " + names[1]
                + " " +  names[2] + " " +  names[3]);
    }
}
