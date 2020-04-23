package com.mikewencel;

public class Category {

    private int id;
    private String typeOfMovie;

    public Category(int id, String typeOfMovie) {
        this.id = id;
        this.typeOfMovie = typeOfMovie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(String typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }
}
