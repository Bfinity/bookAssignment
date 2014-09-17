package com.sample.bookassignment;

/**
 * Created by BFineRocks on 9/16/14.
 */
public class Book {
    private static int booksInLibrary;
    private String bookAuthor;
    private String bookTitle;
    private String bookGenre;

    public Book()
    {
        bookAuthor = "";
        bookTitle = "";
        bookGenre = "";
        booksInLibrary = booksInLibrary + 1;
    }

    public static int getBooksInLibrary() {
        return booksInLibrary;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void printBookInformation()
    {
        System.out.println("Book Author: " + getBookAuthor() + "\n" + "Book Title: " + getBookAuthor() + "\n" +
                "Book Genre: " + getBookGenre());

    }

    public void printReadingIsAwesome()
    {
        System.out.println("Reading is awesome!!");

    }



}
