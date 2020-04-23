package com.mikewencel;

public class Movie {

    private String name;
    private String director;
    private double price;
    Category category;

    public Movie(String name, String director, double price, Category category) {
        this.name = name;
        this.director = director;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void printMovieData(){
        System.out.println(getName());
        System.out.println(getDirector());
        System.out.println(getPrice());
    }
}
