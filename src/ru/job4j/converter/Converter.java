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

        float inRubleToEuro = 140;
        float expectedRubleToEuro = 2;
        float euro = Converter.rubleToEuro(inRubleToEuro);
        boolean passedEuro = expectedRubleToEuro == euro;
        System.out.println("140 рублей = " + euro + " евро " + passedEuro);

        float inRubleToDollar = 180;
        float expectedRubleToDollar = 3;
        float dollar = Converter.rubleToDollar(inRubleToDollar);
        boolean passedDollar = expectedRubleToDollar == dollar;
        System.out.println("100 рублей = " + dollar + " долларов " + passedDollar);

        float inDollarToRuble = 100;
        float expectedDollarToRuble = 6000;
        float dollarToRuble = Converter.dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedDollarToRuble == dollarToRuble;
        System.out.println("100 долларов = " + dollarToRuble + " рублей " + passedDollarToRuble);

        float inEuroToRuble = 100;
        float expectedEuroToRuble = 7000;
        float euroToRuble = Converter.euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedEuroToRuble == euroToRuble;
        System.out.println("100 евро = " + euroToRuble + " рублей " + passedEuroToRuble);

    }
}
