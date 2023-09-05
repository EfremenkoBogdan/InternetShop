import jakarta.persistence.*;

@Entity
@Table (name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn (name = "details_id")
    private CustomerDetail details;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public CustomerDetail getDetails() {
        return details;
    }

    public void setDetails (CustomerDetail details) {
        this.details = details;
    }

    public Customer(String name, CustomerDetail detailsId) {
        this.name = name;
        this.details = details;
    }

    public Customer () {

    }

    @Override
    public String toString() {
        return String.format("Customer[id = %d, name = '%s']", id, name);
    }

}
