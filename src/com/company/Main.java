package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String plot() {
        return "this plot";
    }

}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A SHARK EATS PEOPLE";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    // this only works because it overrides what is in the Movie class. Probably should extend this instead.
    public String plot() {
        return "Aliens";
    }


}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println(movie.getName());
            System.out.println(movie.plot());

        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 2 + 1);
        System.out.println(randomNumber);
        if (randomNumber == 1) {
            return new Jaws();
        } else if (randomNumber == 2) {
            return new IndependenceDay();
        }
        return null;
    }
}
