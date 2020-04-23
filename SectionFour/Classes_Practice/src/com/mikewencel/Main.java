package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	Movie firstMovie = new Movie("Gladiator","Ridley Scott",99.9,new Category(1,"Action"));
        System.out.println(firstMovie.getDirector());
        System.out.println(firstMovie.getName());
        System.out.println(firstMovie.category.getTypeOfMovie());
    }
}
