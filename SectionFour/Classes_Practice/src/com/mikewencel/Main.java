package com.mikewencel;

import sun.security.util.Length;

public class Main {

    public static void main(String[] args) {
	Movie firstMovie = new Movie("Gladiator","Ridley Scott",99.9,new Category(1,"Action"));
        System.out.println(firstMovie.getDirector());
        System.out.println(firstMovie.getName());
        System.out.println(firstMovie.category.getTypeOfMovie());
        System.out.println("*********************");
        firstMovie.printMovieData();
        System.out.println("*********************");
        Movie secondMovie = new Movie("The thing","John Carpenter",69.9,new Category(2,"Horro"));
        secondMovie.printMovieData();
        System.out.println("*********************");

    }
}
