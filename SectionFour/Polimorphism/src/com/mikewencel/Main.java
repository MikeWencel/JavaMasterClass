package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        for(int i = 1;i < 11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() +"\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Terminator();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }

        return null;
    }
}


class Movie {
    private String name;


    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A Shark eats a lot of people";
    }

}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to destroy earth";
    }
}

class Terminator extends Movie {

    public Terminator() {
        super("Terminator");

    }

    @Override
    public String plot() {
        return "Terminator want to kill people";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");

    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }


}


