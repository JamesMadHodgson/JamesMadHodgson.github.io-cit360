package week9ACP;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This handler is used to display the library options of the program to the user of the program
 */

public class menuHandler implements handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        System.out.println("Book Shelf Menu:");
        System.out.println("Choose a option to access the book Shelf");
        System.out.println("\t1-Display Books");
        System.out.println("\t2-Check in a book");
        System.out.println("\t3-Check out a book");
        System.out.println("\t0-Exit");
        System.out.print("Choose your Selection: ");

        Scanner scanner = (Scanner) data.get("scanner");

        int selection = nextPick(scanner);
        return selection;
    }

    private int nextPick(Scanner scanner) { // try and catch for the menu options
        String input = scanner.nextLine();
        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (Exception e) {
            System.out.println("Enter a number from the menu.");
            return -1;
        }

    }
}
