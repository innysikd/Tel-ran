package data;

public enum Genre {

    ACTION ("Fast and Furios", "9.11.19"),
    COMEDY ("The Mask", "28.12.19"),
    DRAMA ("Titanic", "6.11.19"),
    FANTASY ("Lord of the Rings", "26.12.19"),
    HISTORICAL ("Queen Elisabeth", "2.12.19"),
    SCIENCE_FICTION ("Star Wars", "5.12.19"),
    THRILLER ("Black Mirror", "30.1.20");

    private String title;
    private String date;

    Genre(String title, String date) {
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        return title + ", " + date;
    }
}
