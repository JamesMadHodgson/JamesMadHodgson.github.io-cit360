package week9ACP;
import java.util.HashMap;
import java.util.Scanner;
/**
 * check out handler is opposite of the check in this handler
 * the scanner checks out books using the method getbook form the library class
 */
public class checkOutHandler implements handler {
    public Object handleIt(HashMap<String, Object> data){
        Scanner scanner = (Scanner) data.get("scanner");
        Library library = (Library) data.get("library");
        library.getBook(scanner);


        return null;
    }

}
