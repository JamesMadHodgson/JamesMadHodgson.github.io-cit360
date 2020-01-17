package javacollections;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class Main {

    public static void main(String[] args) {
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

        System.out.print("\n  Here is my --MAP-- example\n\n");

        Map<Integer, String> road = new TreeMap<>();
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

