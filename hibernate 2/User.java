import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id

    @Column(name = "id")
//    @GeneratedValue(generator = "incrementator")
    //@GenericGenerator(name = "incrementator", strategy = "increment")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
