package ru.lesson.object.game;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public void  startGame () {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадал число от 0 до 9. Попробуйте угадать его!");

        while (true) {
            System.out.println("Загаданное число: " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println(" Игрок 1 предположил число: " + guessPlayer1 + ".");
            guessPlayer2 = player2.number;
            System.out.println(" Игрок 2 предположил число: " + guessPlayer2 + ".");
            guessPlayer3 = player3.number;
            System.out.println(" Игрок 3 предположил число: " + guessPlayer3 + ".");

            if (guessPlayer1 == targetNumber) {
                player1IsRight = true;
            }

            if (guessPlayer2 == targetNumber) {
                player2IsRight = true;
            }

            if (guessPlayer3 == targetNumber) {
                player3IsRight = true;
            }

            boolean[] players = {player1IsRight, player2IsRight, player3IsRight};

            if (player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("У нас есть победитель!");
                for (int i = 0; i < players.length; i++) {
                    System.out.println("Игрок " + (i + 1) + " угадал? " + players[i]);
                }
                System.out.println("Игра окончена.");
                break;
            } else {
                System.out.println("Игрокам придётся попробовать снова.");
            }
        }
    }
}
