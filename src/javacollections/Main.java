package javacollections;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

/**
 * Java Collections are a frame work that enables the structure to store and change object groups
 * In week 2 we focused on 5 units in the Java collection. The following coded example are in the this order
 * 1. list
 * 2. Set
 * 3. Tree
 * 4. Map
 * 5. Queue
 */

public class Main {

    public static void main(String[] args) {
        /**
         * List use a array for sorting the elements of the array.  Some things about list are these
         * 1. The list can contain duplicates
         * 2. List maintain an order of insertion or index
         * 3. List are not synchronized
         * 4. List are random accessed because they ae indexed based
         * 5. List changes and adjustment require index shifting, removing, adding new old elements.
         */
        System.out.print("\nHere is my --List-- example\n\n");

        String list;
        List myList = new ArrayList();
        myList.add("List");  // index 0
        myList.add("Set");   // index 1
        myList.add("Map");   // index 2
        myList.add("Queue"); // index 3
        myList.add("Tree");  // index 4

        for (Object lis : myList) {
            System.out.println((String) lis);

        }
        /**
         * Set are an unordered list of objects (collection)
         * 1. Sets do nit allow duplicates unlike lists
         * 2. Sets are made through hashsets,LinkedHashSets
         * 3. You can add to the set by methods that add, remove, clear and size.
         * 4. Sets print in numeric order, Alphabetic order.
         *
         */

        System.out.print("\nHere is my --Set-- example\n\n");

        Set<String> collections = new HashSet<>(); // printing in Alphabetical order
        collections.add("List");
        collections.add("Set");
        collections.add("Map");
        collections.add("Queue");
        collections.add("Tree");

        for (String set : collections) {
            System.out.println(new String(set));
        }

        /**
         * Tree implement the Set interface and uses a tree structure for data storage.
         * 1. Trees have unique elements HashSet for example.
         * 2. Tree retrieval time are fast
         * 3. Tree do not allow null elements
         * 4. Tree is not synchronized output
         * 5. Tree maintains (ascending) order always.
         */
        System.out.print("\n  Here is my --Tree-- example\n\n");

        TreeSet<String> myTree = new TreeSet<>();
        myTree.add("first");
        myTree.add("second");
        myTree.add("third");
        myTree.add("grape");
        myTree.add("apple");
        myTree.add("peach");

        for (String tree : myTree) {
            System.out.println(tree);

        }
        System.out.println(myTree);

        /**
         * Maps in the Java collection have keys and value pairs.
         * 1. Maps Each key and value is an known entry.
         * 2. Maps are used to search, update, or delete elements on basis of the key.
         * 3. Maps do not have duplicate keys.
         * 4. Maps do have duplicate values.
         * 5. Using hash and linkedhash allow null keys and values.
         */
        System.out.print("\n  Here is my --MAP-- example\n\n");

        Map<Integer, String> road = new HashMap<>();
        road.put(1, "Home");
        road.put(2, "ChurchBuilding");
        road.put(3, "HighSchool");
        road.put(4, "Store Solebergs");


        Set<Map.Entry<Integer, String>> st = road.entrySet();
        for (Map.Entry<Integer, String> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println(road);

        /**
         * Waiting in line
         * Queue in Java Collection use a FIFO first in, first out manner.
         * 1. Queue have a start and end order
         * 2. Queue Elements are keep in order no changing
         * 3. Queue have other types, LinkedList, Dequeue, Blocking queue and dequeue.
         */

        System.out.print("\nHere is my --Queue-- example\n\n");

        Queue<String> fifo = new LinkedList<>();
        fifo.add("First Place");
        fifo.add("Second Place");
        fifo.add("Third Place");
        fifo.add("Fourth Place");

        for (String s : fifo) {
            System.out.println(s.toString());

        }


    }
}

