package ru.job4j.calculator;

public class AgeMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Stepan-Zazyan";
        int age = 30;
        AgeMethod.hello(name, age);
        AgeMethod.hello(name, age);
        AgeMethod.hello(name, age);
        AgeMethod.hello(name, age);
    }
}
