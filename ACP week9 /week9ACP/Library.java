package week9ACP;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * the library class holds the hard coded books suing an array

 */

public class Library {

    private ArrayList<book> books;

    public Library() {
        books = new ArrayList<>();
        String  Rowling = "J.K Rowling";

        /**
         * this adds to the book array and creates the library
         */
        books.add(new book("Rowling", "Harry Potter and the sorcerer's stone"));
        books.add(new book("Rowling", "Harry Potter and the chambers of secrets"));
        books.add(new book("Rowling", "Harry Potter and the prisoner of azkaban"));
        books.add(new book( "Rowling", "Harry Potter and the goblet of fire"));
        books.add(new book("Test", "Test"));
    }

    /**
     * this method is used for adding books to the library and is called from the checkIn handler class
     * @param book
     */
    public void checkIn(book book) {
        this.books.add(book);
    }

    public void checkout(book checkOut) {

        System.out.println(checkOut.toString());

        this.books.remove(checkOut);
    }

    /**
     * this method is used from the checkout handler
     * this removes books ffrom the library
     * @param input
     */
    public void getBook(Scanner input){


        Scanner scanner = new Scanner(System.in);

        /*   for(int i = 0; i < books.size(); i++){

            if(Objects.equals(books.get(i).getAuthor(), author) && Objects.equals(books.get(i).getTitle(), title)){
                books.remove(i);

                return;
            }

        } */


        for(int i = 0; i < books.size(); i++){
            System.out.println(i + " - " + books.get(i).toString());
        }

        System.out.println("What book do you want to checkout?");
        int selection = scanner.nextInt();

        System.out.println("Thanks for checking out " + books.get(selection).toString());

        books.remove(selection);

    }

    /**
     * this method is for printing the library with added syntac for added printing views
     * @return
     */
    @Override
    public String toString() {


       String libraryString = "";

       libraryString += "Library books->\n\t";

        ArrayList<String> bookList = new ArrayList<>();
        for(book book : books) {
            bookList.add(book.toString());

        }

        String bookStrings = String.join(",\n\t", bookList);

        libraryString += bookStrings;
        libraryString += "<-\n|";

        return libraryString;
    }



}
