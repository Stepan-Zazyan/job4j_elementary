package ru.job4j.condition;
//Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."

 //      Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."

 //       Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
public class DummyBot {
    @SuppressWarnings("checkstyle:RightCurly")
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

     public static void main(String[] args) {
     String rsl = DummyBot.answer("Привет, Бот.");
     System.out.println(rsl);
     rsl = DummyBot.answer("Пока.");
     System.out.println(rsl);
    }
}
