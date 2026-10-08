package ru.lesson.object.game;

public class SongTest {
    public static void main(String[] args) {
        Song song = new Song("Billy Joel", "Piano");
        System.out.println(song);

        Song song1 = new Song();
        song.setArtist("Принт");
    }
}
