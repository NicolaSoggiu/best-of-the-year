package com.example.bestoftheyear.model;

public class Song {

    // ATTRIBUTI
    private int id;
    private String title;

    // COSTRUTTORE
    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
