package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int num) {
        String day;
        switch (num) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Ошибка";
                break;
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
    }
}
