package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int i;
        switch (name) {
            case "Monday":
            case "Пoнедельник":
                i = 1;
                break;
            case "Tuesday":
            case "Вторник":
                i = 2;
                break;
            case "Wednesday":
            case "Среда":
                i = 3;
                break;
            case "Thursday":
            case "Четверг":
                i = 4;
                break;
            case "Friday":
            case "Пятница":
                i = 5;
                break;
            case "Sutirday":
            case "Суббота":
                i = 6;
                break;
            case "Sunday":
            case "Воскресенье":
                i = 7;
                break;
            default:
                i = -1;
                break;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Monday"));
    }
}
