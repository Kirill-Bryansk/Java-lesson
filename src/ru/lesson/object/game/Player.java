package ru.lesson.object.game;

import java.util.Random;

public class Player {
    int number;
    void guess() {
        Random random = new Random();
        number = random.nextInt(10);
    }
}
