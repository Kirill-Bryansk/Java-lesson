package ru.lesson.object.game;

public class Song {
    String title;
    String artist;

    public Song() {
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("Плей плей");
    }

    @Override
    public String toString() {
        return "Song {" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}


