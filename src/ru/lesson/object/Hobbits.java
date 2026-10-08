package ru.lesson.object;

class Hobbits {
    String name;
}

class HobbitsTest {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        while (z < 3) {

            h[z] = new Hobbits();
            h[z].name = "бильбо";
            if (z == 1) {
                h[z].name = "фродо";
            }
            if (z == 2) {
                h[z].name = "сэм";
            }
            System.out.println(h[z].name + " - это");
            System.out.println("Хорошее имя хобита");
            z = z + 1;
        }
    }
}
