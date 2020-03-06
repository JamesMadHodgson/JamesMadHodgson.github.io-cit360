package week9ACP;

import java.util.HashMap;

/**
 * application controller directs the handler methods to be called in the program
 */

public class applicationController {
    private HashMap<String, handler> gets;  // handlers are the object of the HashMap

    public applicationController() {
        gets = new HashMap<String, handler>();
        gets.put("addBook", new checkInHandler());  // handler method
        gets.put("displayBooks", new displayBookHandler());  // handler method
        gets.put("displayMenu", new menuHandler());  // handler method
        gets.put("checkOut", new checkOutHandler());
    }

    /**
     * returns the handler chosen for the programs function to the mainHandler or handleIt method
     * @param commandKey
     * @param commandData
     * @return
     * @throws Exception
     */
    public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {   // uses the hashmap for the commands of key and values to return
        handler command = gets.getOrDefault(commandKey, null);
        if (command == null) {
            throw new Exception("There is no command with the key word '" + commandKey + "'.");
        }

        return command.handleIt(commandData); // gives the command to mainHandler class
    }
}
