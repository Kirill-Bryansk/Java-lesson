package ru.lesson.party;

public class Loopy {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Перед циклом");
        while (x < 4) {
            System.out.println("Значение в цикле равно " + x);
            x = x + 1;
        }
    }

}
