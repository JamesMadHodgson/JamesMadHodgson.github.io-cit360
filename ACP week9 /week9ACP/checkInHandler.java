package week9ACP;
import java.util.HashMap;
import java.util.Scanner;

/**
 * checkInhandler class has a scanner that user input of books to add to the library and references the checkIn method in the library class
 */

public class checkInHandler implements handler {
    public Object handleIt(HashMap<String, Object> data) {
        Scanner scanner = (Scanner) data.get("scanner");
        Library library = (Library) data.get("library");

        System.out.print("Enter an author: ");
        String author = scanner.nextLine();
        System.out.print("Enter a title: ");
        String title = scanner.nextLine();
        book newBook = new book(author, title);
        library.checkIn(newBook); //puts info into the library
        return null;
    }
}
