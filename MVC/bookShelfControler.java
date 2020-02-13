package MVC;

import java.util.ArrayList;
import java.util.Objects;


class bookShelfController {

    public static void main(String[] args) {
	// write your code here
/**
 * this starts 5 books on the book shelf called form the controller
 */
        boolean run = true;
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("Book Of Mormon");
                add("Old Testament");
                add("New Testament");
                add("Doctrine & Covenants");
                add("George Washington");
            };
        };
/**
 * these calls are to the view and the model
 * the Controller talks to the view and model
 * Never does the model and view talk
 */
        bookShelfModel model = new bookShelfModel(list);
        bookShelfView view = new bookShelfView();
/**
 * the while loop shows talking of controller to model
 * and controller to view
 */
        while(run){

            String selection = view.menu();

            // System.out.println("The user chose: " + selection + "\n");

            if(Objects.equals(selection, "add")) {
                model.addBook(view.getBookName("add"));
            }

            if(Objects.equals(selection, "checkout")){
                model.checkOut(view.getBookName("checkout"));
            }
            if(Objects.equals(selection, "empty")){
                model.empty();
            }
            if(Objects.equals(selection, "available")){
                view.printBookshelf(list);
            }

            if(Objects.equals(selection, "quit")){
                run = false;
            }
        }
        
        view.printBookshelf(list);
        
    }

}

