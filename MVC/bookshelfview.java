package MVC;

import java.util.ArrayList;
import java.util.*;

/**
 * this makes the books on the shelf available to view to the user getting the ifo from the controller
 */
class bookShelfView {

    public void printBookshelf(ArrayList<String> shelf){

        for (int i = 0; i < shelf.size();i++)
        {
            if ( i % 4 == 0 && i != 0) {
                System.out.print("|\n");
            }

            System.out.print('|' + shelf.get(i) + "\t");

            if ( i == shelf.size() -1) {
                System.out.print("|");
            }
        }

        System.out.print("\n");
    }
    public void printWelcomeMessage(){
        System.out.print("Welcome to Virtual Book Shelf");
    }

    /**
     * the menu lets the the user view the bookshelf
     * the view gets this information for the shelf form the controller
     * @return
     */
    public String menu(){

        int selection;
        Scanner input = new Scanner(System.in);


        System.out.print(   "What would you like to do now?\n" +
                            "(Return the number value of your option)\n" +
                            "   1. Add a book to the bookshelf\n" +
                            "   2. Checkout a book\n" +
                            "   3. Empty the bookshelf\n" +
                            "   4.Show bookshelf\n"  +
                            "   5. Quit the program\n" +
                            "-> ");

        selection = input.nextInt();

        switch(selection) {
            case 1:
                return "add";
            case 2:
                return "checkout";
            case 3:
                return "empty";
            case 4:
                return "available";
            case 5:
                return "quit";
        }

        return "error";
    }

    /**
     * this action talks to the controller the input from the user entered into the book shelf
     * @param action
     * @return
     */
    public String getBookName(String action){
        String inputS;
        Scanner input = new Scanner(System.in);

        System.out.print("What book you want to " + action + "?: " );
        inputS = input.nextLine();

        return inputS;
    }

}
