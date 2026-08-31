package ru.lesson.party;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("я");
            if (x < 1) {
                System.out.print(" ");
            }

            System.out.print("ты");

            if (x > 1) {
                System.out.print(" монстр");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("шум");
            }
            if (x < 1) {
                System.out.print("ус");
            }
            System.out.println();
            x = x + 1;
        }
    }
}
