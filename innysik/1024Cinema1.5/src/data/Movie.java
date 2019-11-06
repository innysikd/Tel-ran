package data;

import java.util.Arrays;
import java.util.Objects;

public class Movie {

    private String name;
    private Genre genre;
    private Cinema[] cinemas;
    private String date;

    public Movie(String name, Genre genre, Cinema[] cinemas, String date) {
        this.name = name;
        this.genre = genre;
        this.cinemas = cinemas;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(getName(), movie.getName()) &&
                getGenre() == movie.getGenre() &&
                Arrays.equals(getCinemas(), movie.getCinemas()) &&
                Objects.equals(getDate(), movie.getDate());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getGenre(), getDate());
        result = 31 * result + Arrays.hashCode(getCinemas());
        return result;
    }

    @Override
    public String toString() {
        return "Movie " +
                "name " + name +
                ", genre " + genre +
                ", cinemas " + Arrays.toString(cinemas) +
                ", date " + date;
    }

    public void displayCinemas(){
        for (int i = 0; i<this.getCinemas().length; i++){
            System.out.println(cinemas[i]);
        }
    }

}
