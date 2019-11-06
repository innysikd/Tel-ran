package controller;

import dao.Schedule;
import data.*;

public class CinemaApp {

    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Thalia");
        Cinema cinema2 = new Cinema("Star", new Address("Hauptstr.", 56)); //one way: constructor address declared inside
        Address address = new Address("Berlinersrt.",  18); //the other way. we declare the address first
        Cinema cinema3 = new Cinema("Astra", address);
        Cinema cinema4 = new Cinema("Space");

        Cinema [] c1 = {cinema1, cinema2};
        Cinema [] c2 = {cinema2, cinema3};
        Cinema [] c3 = {cinema1, cinema3, cinema4};
        Cinema [] c4 = {cinema1, cinema2, cinema3, cinema4};

        Schedule schedule = new Schedule(20);

        Movie movie1 = new Movie ("Fast and Furious", Genre.ACTION, c1 , "29.10.19");
        Movie movie2 = new Movie ("The Mask", Genre.COMEDY, c1, "19.10.19");
        Movie movie3 = new Movie ("Titanic", Genre.DRAMA, c1, "29.11.19");
        Movie movie4 = new Movie ("Lord of the Rings", Genre.FANTASY, c1, "29.10.19");
        Movie movie5 = new Movie ("Queen Elisabeth", Genre.HISTORICAL, c1, "18.10.19");
        Movie movie6 = new Movie ("Star Wars", Genre.SCIENCE_FICTION, c1, "8.10.19");

        schedule.addMovie(movie1);
        schedule.addMovie(movie2);
        schedule.addMovie(movie3);
        schedule.addMovie(movie4);
        schedule.addMovie(movie5);
        schedule.addMovie(movie6);

        schedule.searchMoviesByDate("29.10.19");
    }

}
