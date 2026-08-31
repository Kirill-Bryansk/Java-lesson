package ru.lesson.party;

public class BottleSong {
    public static void main(String[] args) {
        int bottleSum = 5;
        String word = "бутылок";

        while (bottleSum > 0) {
            System.out.println(bottleSum + " " + word + " стояло на стене");
            System.out.println("И если одна случайно упадет");
            bottleSum -= 1; // или bottleSum--
            if (bottleSum == 0) {
                System.out.println("Не останется ни одной бутылки на стене\n");
            } else {
                System.out.println("Останется " + bottleSum + " на стене \n");
            }
        }
        System.out.println("Ни одной бутылки не стоит на стене");
        System.out.println("И если ни одна бутылка больше не упадет");
        System.out.println("То так и будет - ноль бутылок на стене!");
    }
}
