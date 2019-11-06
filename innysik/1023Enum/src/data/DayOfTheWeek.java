package data;

public class DayOfTheWeek {

    private String title;

    public DayOfTheWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Day Of The Week is " +
                  title + '\'';
    }
}
