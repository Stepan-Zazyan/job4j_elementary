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
        float in = 100;
        float expected = 2;
        float expectedDollarToRuble = 6000;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(in);
        float dollarToRuble = Converter.dollarToRuble(in);
        float euroToRuble = Converter.euroToRuble(in);
        boolean passedEuro = expected == euro;
        boolean passedDollar = expected == dollar;
        boolean passedDollarToRuble = expectedDollarToRuble == dollarToRuble;
        boolean passedEuroToRuble = expected == euroToRuble;
        System.out.println("100 рублей = " + euro + " евро " + passedEuro);
        System.out.println("100 рублей = " + dollar + " долларов " + passedDollar);
        System.out.println("100 долларов = " + dollarToRuble + " рублей " + passedDollarToRuble);
        System.out.println("100 евро = " + euroToRuble + " рублей " + passedEuroToRuble);
    }
}
