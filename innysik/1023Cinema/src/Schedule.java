public class Schedule {

    private Genre genre;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void getDate (Genre genre){
        switch (genre){
            case ACTION:
                System.out.println("23.11.19");
                break;
            case COMEDY:
                System.out.println("19.11.19");
                break;
            case DRAMA:
                System.out.println("27.12.19");
                break;
            case FANTASY:
                System.out.println("6.12.19");
                break;
            case HISTORICAL:
                System.out.println("8.11.19");
                break;
            case SCIENCE_FICTION:
                System.out.println("18.12.19");
        }

    }
}

