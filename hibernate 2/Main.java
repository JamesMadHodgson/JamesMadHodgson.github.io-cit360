import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");

        User user = new User();
        user.setId(1);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Make some changes to the database
        entityManager.getTransaction().begin();

        //Anything located here are changes made to the database.
        entityManager.persist(user);


        entityManager.getTransaction().commit();

    }
}
