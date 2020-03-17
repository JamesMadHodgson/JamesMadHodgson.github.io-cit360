package week10;

import java.util.*;


//public class Main {

public class Main {

    public static void main(String[] args) {

        testDAO t = testDAO.getInstance();

        List<Customer> c = t.getCustomers();
        for (Customer i : c) {
            System.out.println(i);
        }
        System.out.println(t.getCustomer(1));

        t.insertCustomer();
    }


}

