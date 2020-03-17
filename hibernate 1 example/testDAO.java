package week10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

/**
 * singleton pattern to get customer info to data base
 */
public class testDAO {

    int id = 10;

    SessionFactory factory = null;
    Session session = null;

    private static testDAO single_instance = null;

    private testDAO() {
        factory = hibernateUtil.getSessionFactory();
    }

    /** This is what makes this class a singleton class of the instance for customer to data base.  You use this
     *
     * @return
     */

    public static testDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new testDAO();
        }

        return single_instance;
    }


    public List<Customer> getCustomers() {
/**
 * try block used to catch errors to data base through hibernate xml file
 */
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from week10.Customer";
            List<Customer> cs = (List<Customer>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /**
     *    single customer from database
     * @param id
     * @return
     */
       public Customer getCustomer(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from week10.Customer where id=" + Integer.toString(id);
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    /**
     * insert is able to get scanner info to the database
     * this includes customer
     * address
     * phone
     */
    public void insertCustomer() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();

            Scanner in = new Scanner(System.in);
            String name;
            String address;
            String phone;

            System.out.println("Customer name:");
            name = in.nextLine();
            System.out.println("Customer address:");
            address = in.nextLine();
            System.out.println("Customer phone:");
            phone = in.nextLine();

            Customer newCustomer = new Customer();
            //newCustomer.setId(id);
            newCustomer.setName(name);
            newCustomer.setAddress(address);
            newCustomer.setPhone(phone);

            session.persist(newCustomer);

            session.getTransaction().commit();
            id++;

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

}
