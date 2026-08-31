package ru.lesson.party;

public class Shuff {
    public static void main (String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b в");
            }
            if (x == 1) {
                System.out.print("г");
                x = x - 1;
            }
        }
    }
}
