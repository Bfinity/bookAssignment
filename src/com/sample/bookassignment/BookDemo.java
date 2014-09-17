package com.sample.bookassignment;

/**
 * Created by BFineRocks on 9/16/14.
 */
import java.util.Scanner;
public class BookDemo {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter author name");
        String authorName = userInput.nextLine();
        System.out.println("Enter book title");
        String bookName = userInput.nextLine();

        Book bookNumberOne = new Book(authorName, bookName);

        System.out.println("Enter book genre");
        bookNumberOne.setBookGenre(userInput.nextLine());

        bookNumberOne.printBookInformation();
        bookNumberOne.printReadingIsAwesome();

        System.out.println("There are " + Book.getBooksInLibrary() + " books in my library");

        System.out.println("Enter author name");
        authorName = userInput.nextLine();
        System.out.println("Enter book title");
        bookName = userInput.nextLine();

        Book bookNumberTwo = new Book(authorName, bookName);
        System.out.println("Enter book genre");
        bookNumberTwo.setBookGenre(userInput.nextLine());

        bookNumberTwo.printBookInformation();
        bookNumberTwo.printReadingIsAwesome();

        System.out.println("There are " + Book.getBooksInLibrary() + " books in my library");



    }
}
