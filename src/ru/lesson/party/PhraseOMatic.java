package ru.lesson.party;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {

        Random random = new Random();

        String[] wordListOne = {
                "безопасный", "гибкий", "интерактивный",
                "облачный", "встроенный", "адаптивный"
        };

        String[] wordListTwo = {
                "с защитой на уровне ядра", "на событийной модели", "с высокой доступностью",
                "в распределительной среде", "с нулевой точкой отказа", "c масштабируемым подходом"
        };

        String[] wordListThree = {
                "сервис", "фреймворк", "модуль",
                "конвейер", "репозиторий", "шаблон",
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = random.nextInt(oneLength);
        int rand2 = random.nextInt(twoLength);
        int rand3 = random.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " +
                        wordListTwo[rand2] + " " +
                        wordListThree[rand3];

        System.out.println("Нам нужно " + phrase);

    }
}
