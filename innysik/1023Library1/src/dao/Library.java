package dao;

import data.Book;

public class Library {  // this Class Library = arr Library

    private Book[] books;  // new array
    private int size;    //it's size

    public Library (int capacity){   // this Constructor makes a new array
        books = new Book[capacity];
    }

    public int getSize (){
        return size;
    }

    public boolean addBook (Book book){  // to check if there is enough capacity for a new book
        if(size < books.length){
            books[size] = book;
            size ++;
            return true;
        }
        return false;
    }

    public boolean deleteBook (Book book){
        System.out.println("current size is " + size);
        for (int i=0; i<size; i++){
            if (books[i].equals(book)){
                books[i] = books[size-1];           //the last book goes instead of the deleted one
                size--;
                System.out.println("size after " + size);
                return true;
            }
        }
        return false;
    }

    public void display(){
        for (int i=0; i<size; i++){
            System.out.println(books[i]);
        }
    }

    public int searchBook (Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                return 1;
            }
        }
        return -1;
    }

    public void searchAuthor (String author){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)){
                System.out.println(books[i]);
                flag = true;
        }
    }
        if (flag){
        System.out.println("Sorry, no such author");
        }
    }

    public int getOldestBook (){
        int oldestBook = books[0].getDateOfIssue();  // we say, that the first element is the oldest book
        for (int i = 1; i < size; i++) {    //so we can begin the count from the second element
            if (oldestBook > books[i].getDateOfIssue())
                oldestBook = books[i].getDateOfIssue();
            }
        return oldestBook;
    }


}

