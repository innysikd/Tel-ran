package data;

public class Schedule {

    private Genre genre;

    public Genre getGenre() {
        return genre;
    }

    public static void getScheduleByGenre(Genre genre){
        switch (genre){
            case ACTION:
                System.out.println(Genre.ACTION + " (" + Genre.ACTION.name() + ")");
                break;
            case COMEDY:
                System.out.println(Genre.COMEDY + " (" + Genre.COMEDY.name() + ")");
                break;
            case DRAMA:
                System.out.println(Genre.DRAMA + " (" + Genre.DRAMA.name() + ")");
                break;
            case FANTASY:
                System.out.println(Genre.FANTASY + " (" + Genre.FANTASY.name() + ")");
                break;
            case HISTORICAL:
                System.out.println(Genre.HISTORICAL + " (" + Genre.HISTORICAL.name() + ")");
                break;
            case SCIENCE_FICTION:
                System.out.println(Genre.SCIENCE_FICTION + " (" + Genre.SCIENCE_FICTION.name() + ")");
                break;
            case THRILLER:
                System.out.println(Genre.THRILLER + " (" + Genre.THRILLER.name() + ")");
                break;
        }
    }
}
