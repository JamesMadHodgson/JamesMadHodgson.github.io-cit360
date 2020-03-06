package week9ACP;

import java.util.HashMap;

/**
 * this handler calls to the toString method in the library class printing to the user the available books in the library
 */

    public class displayBookHandler implements handler {

        public Object handleIt(HashMap<String, Object> data) {
            Library library = (Library) data.get("library");
            String s = library.toString();
            System.out.println(s);
            return null;
        }
    }

