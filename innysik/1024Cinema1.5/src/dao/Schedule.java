package dao;

import data.Cinema;
import data.Genre;
import data.Movie;

public class Schedule {

    private Movie[] movies;
    int size;

    public Schedule (int capacity) {   // this Constructor makes a new array
        movies = new Movie[capacity];
        size = 0;
    }

    public boolean addMovie (Movie movie){
        if (size < movies.length){
            movies [size] = movie;
            size ++;
            return true;
        }
        return false;
    }

    public boolean deleteMovie (Movie movie){
        for (int i = 0; i<size; i++){
            if (movies[i].equals(movie)){
                movies[i] = movies [size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayMovies(){
        for (int i = 0; i<size; i++){
            System.out.println(movies[i]);
        }
    }

    public void searchMoviesByDate (String date){
        System.out.println(date + " you can watch the following movies: ");
        for (int i = 0; i<size; i++){
            if (movies[i].getDate().equalsIgnoreCase(date)){
                System.out.println(movies[i].getName() + " / " + movies[i].getGenre().name());
                movies[i].displayCinemas();
                System.out.println("-----------");
            }
        }
    }

    public void searchMoviesByGenre (Genre genre){
        System.out.println("Genre " + genre.name() + "you can watch following movies");
        for (int i = 0; i<size; i++){
            if (movies[i].getGenre().name().equalsIgnoreCase(genre.name())){
                System.out.println(movies[i].getName() + " / " + movies[i].getDate());
                movies[i].displayCinemas();
            }
        }
    }

    public void searchMovieByCinema (String cinemaName){
        System.out.println("In the cinema " + cinemaName + "you can watch: ");
        for (int i = 0; i<size; i++){
            if (Cinema.isCinemaInArray(movies[i].getCinemas(), cinemaName)){
                System.out.println(movies[i].getName() + "genre:" + movies[i].getGenre().name() + " on " + movies[i].getDate());
            }
        }

    }

    public int getIndexOfMovieInSchedule (String movieName){
        int indexOfMovie = -1;
        for (int i = 0; i<size; i++){
            if (movies[i].getName().equalsIgnoreCase(movieName)){
                indexOfMovie = i;
            }
        }
        return indexOfMovie;
    }

    public void searchCinemaByMovie (String name){
        int index = getIndexOfMovieInSchedule(name);
        if (index<0){
            System.out.println("No such movie on our schedule");
        } else {
            System.out.println("You can watch" + name + "in the following cinemas: ");
                    movies[index].displayCinemas();

        }
    }



}
