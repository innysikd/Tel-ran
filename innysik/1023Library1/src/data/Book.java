package data;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int pages;
    private int dateOfIssue;

    public Book (String title, String author, int pages, int dateOfIssue){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateOfIssue = dateOfIssue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                dateOfIssue == book.dateOfIssue &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages, dateOfIssue);
    }

    @Override
    public String toString() {
        return "Book: " + title +
                ", author: " + author +
                ", pages: " + pages +
                ", date of issue: " + dateOfIssue;
    }
}
