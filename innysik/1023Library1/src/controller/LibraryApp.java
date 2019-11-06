package controller;

import dao.Library;
import data.Book;

import javax.sound.midi.Soundbank;

public class LibraryApp {

    public static void main(String[] args) {

        Book book1 = new Book ("Harry Potter", "J.K. Rowling", 238, 1997);
        Book book2 = new Book ("Winnie the Pooh", "A.Milne", 150, 1957);
        Book book3 = new Book ("Sherlock Holmes", "A. Conan Doyle", 388, 1980);
        Book book4 = new Book ("Rome diary", "Hunter Thompson", 150, 2010);
        Book book5 = new Book ("War and peace", "Lev Tolstoy", 1500, 2000);

        Library myLib = new Library(100);
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        myLib.addBook(book5);

        Library library = new Library(30);
        library.addBook(book1);
        library.addBook(book5);

        myLib.display();
        System.out.println("-----------");
        library.display();

        System.out.println("--------");

        myLib.deleteBook(book3);
        System.out.println("-------");
        myLib.display();

        System.out.println("------");
        System.out.println(myLib.searchBook(book1));
        System.out.println("------");
        myLib.searchAuthor("Dostoevsky");
        System.out.println("------");
        System.out.println(myLib.getOldestBook());

    }
}
