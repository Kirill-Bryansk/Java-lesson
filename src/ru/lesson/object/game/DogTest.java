package ru.lesson.object.game;

public class DogTest {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }


        dogs[0].size = 61;
        dogs[1].size = 15;

        dogs[0].bark();
        dogs[1].bark();
        dogs[2].bark();

    }
}
