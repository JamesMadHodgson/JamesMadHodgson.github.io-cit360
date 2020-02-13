package MVC;
import java.util.ArrayList;

/**
 * these constructors and functions only talk to and receive information from the controller
 * never do they talk direct to view
 */

public class bookShelfModel {

    private ArrayList<String> books;


    /*************************************************
     * CONSTRUCTORS
     *************************************************/

    // Default constructor
    public bookShelfModel(){

    }

    // Non-Default constructor
    public bookShelfModel(ArrayList<String> books){

        this.books = books;
    }


    /*************************************************
     * FUNCTIONS
     *
     *************************************************/

    public ArrayList<String> getBookShelf(){

        return this.books;
    }

    public void addBook(String book){

        this.books.add(book);
    }

    public void checkOut(String book){

        this.books.remove(book);
    }

    public void empty (){
        this.books.clear();

    }


}
