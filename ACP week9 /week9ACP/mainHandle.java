package week9ACP;

import java.util.HashMap;

/**
 * interface for the gets command for the application controller
 * from here the handleIt methods call the handlers that are needed for the programs function
 */
interface handler {
    public Object handleIt(HashMap<String, Object> data);

}