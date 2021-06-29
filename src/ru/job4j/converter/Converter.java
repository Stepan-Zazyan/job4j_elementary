package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float valueToEuro) {
        return valueToEuro / 70;
    }

    public static float rubleToDollar(float valueToDollar) {
        return valueToDollar / 60;
    }

    public static float euroToRuble(float valueToPocketLeft) {
        return valueToPocketLeft * 70;
    }

    public static float dollarToRuble(float valueToPocketRight) {
        return valueToPocketRight * 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(100);
        float dollar = Converter.rubleToDollar(100);
        float rublePocketLeft = Converter.dollarToRuble(100);
        float rublePocketRight = Converter.euroToRuble(100);
        System.out.println("100 рублей = " + euro + " евро");
        System.out.println("100 рублей = " + dollar + " долларов");
        System.out.println("100 долларов = " + rublePocketLeft + " рублей");
        System.out.println("100 евро = " + rublePocketRight + " рублей");
    }
}
