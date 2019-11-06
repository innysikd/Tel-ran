package data;

public enum WeeksDay {
    SUNDAY ("sun"),
    MONDAY ("mon"),
    TUESDAY ("tue"),
    WEDNESDAY ("wed"),
    THURSDAY ("thu"),
    FRIDAY ("fri"),
    SATURDAY ("sat");

    private String title;

    WeeksDay(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "WeeksDay{" +
                "title='" + title + '\'' +
                '}';
    }
}
